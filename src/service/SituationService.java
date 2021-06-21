package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.situationExample;
import bean.user;
import bean.situation;
import bean.situationExample.Criteria;
import dao.situationMapper;

@Service
public class SituationService {
	@Autowired
	private situationMapper situationMapper;

	public PageInfo<situation> search(String sname, String major, Integer pageNum) {
		situationExample situationexample=new situationExample();
		PageHelper.startPage(pageNum, 6);
		Criteria criteria =situationexample.createCriteria();
		if(sname != null && sname.trim() != "") {
			criteria.andSnameLike("%"+sname+"%");
		}
		if(major != null && major.trim() != "") {
			criteria.andSmajorLike("%"+major+"%");
		}
		List<situation> situationlist = situationMapper.selectByExample(situationexample);
		PageInfo<situation> page=new PageInfo<situation>(situationlist);
		return page;
	}

	public void add(situation situation) {
		// TODO 自动生成的方法存根
		situationMapper.insert(situation);
	}

	public situation edit(String sno) {
		situation situation = situationMapper.selectByPrimaryKey(sno);
		return situation;
	}

	public void update(situation situation) {
		// TODO 自动生成的方法存根
		situationMapper.updateByPrimaryKeySelective(situation);
	}

}