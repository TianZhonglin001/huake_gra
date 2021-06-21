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
	
	//用户登录
	public user login(user users) {
		// TODO 自动生成的方法存根
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
		System.out.println("总页数"+page.getPages());
		System.out.println("总记录数"+page.getTotal());
		System.out.println("上一页"+page.getPrePage());
		System.out.println("下一页"+page.getNextPage());
		System.out.println("是否有下一页"+page.isHasNextPage());
		System.out.println("是否有上一页"+page.isHasPreviousPage());
		System.out.println("当前页"+page.getPageNum());
		*/
	//获取用户首页
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
		// TODO 自动生成的方法存根
		userMapper.insert(user);
	}
	public user detail(Integer uid) {
		user user = userMapper.selectByPrimaryKey(uid);
		return user;
	}
	public void update(user user) {
		// TODO 自动生成的方法存根
		userMapper.updateByPrimaryKeySelective(user);
	}
	public void delete(Integer uid) {
		// TODO 自动生成的方法存根
		userMapper.deleteByPrimaryKey(uid);
	}

}
