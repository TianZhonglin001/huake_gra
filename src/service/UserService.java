package service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.userExample.Criteria;
import bean.user;
import bean.userExample;
import dao.userMapper;

@Service
public class UserService {
	@Autowired
	private userMapper userMapper;
	
	//�û���¼
	public user login(user users) {
		// TODO �Զ����ɵķ������
		userExample example=new userExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(users.getUsername());
		criteria.andPasswordEqualTo(users.getPassword());
		criteria.andDepartmentEqualTo(users.getDepartment());
		List<user> list = userMapper.selectByExample(example);
		if(list != null) {
			return list.get(0);
		}else {
			return null;
		}
	}
/*	
		System.out.println("��ҳ��"+page.getPages());
		System.out.println("�ܼ�¼��"+page.getTotal());
		System.out.println("��һҳ"+page.getPrePage());
		System.out.println("��һҳ"+page.getNextPage());
		System.out.println("�Ƿ�����һҳ"+page.isHasNextPage());
		System.out.println("�Ƿ�����һҳ"+page.isHasPreviousPage());
		System.out.println("��ǰҳ"+page.getPageNum());
		*/
	//��ȡ�û���ҳ
	public PageInfo<user> search(String username, Integer department, Integer pageNum) {
		userExample userexample=new userExample();
		PageHelper.startPage(pageNum, 3);
		Criteria criteria = userexample.createCriteria();
		if(username != null && username.trim() != "") {
			criteria.andUsernameLike("%"+username+"%");
		}
		if(department != null && department != 0) {
			criteria.andDepartmentEqualTo(department);
		}
		List<user> userlist = userMapper.selectByExample(userexample);
		PageInfo<user> page=new PageInfo<user>(userlist);
		return page;
	}
	public void save(user user) {
		// TODO �Զ����ɵķ������
		userMapper.insert(user);
	}
	public user detail(Integer uid) {
		user user = userMapper.selectByPrimaryKey(uid);
		return user;
	}
	public void update(user user) {
		// TODO �Զ����ɵķ������
		userMapper.updateByPrimaryKeySelective(user);
	}
	public void delete(Integer uid) {
		// TODO �Զ����ɵķ������
		userMapper.deleteByPrimaryKey(uid);
	}

}
