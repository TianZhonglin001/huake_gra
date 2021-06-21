package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.company;
import bean.notice;
import bean.noticeExample;
import bean.noticeExample.Criteria;
import dao.noticeMapper;

@Service
public class NoticeService {
	@Autowired
	private noticeMapper noticeMapper;

	public PageInfo<notice> search(String nname, Integer pageNum) {
		noticeExample noticeexample=new noticeExample();
		PageHelper.startPage(pageNum, 3);
		Criteria criteria = noticeexample.createCriteria();
		if(nname != null && nname.trim() != "") {
			criteria.andNnameLike("%"+nname+"%");
		}
		List<notice> noticelist = noticeMapper.selectByExample(noticeexample);
		PageInfo<notice> page=new PageInfo<notice>(noticelist);
		return page;
	}

	public void save(notice notice) {
		// TODO 自动生成的方法存根
		noticeMapper.insert(notice);
	}

	public notice edit(Integer nid) {
		notice notice = noticeMapper.selectByPrimaryKey(nid);
		return notice;
	}

	public void update(notice notice) {
		// TODO 自动生成的方法存根
		noticeMapper.updateByPrimaryKeySelective(notice);
	}

	public void delete(Integer eid) {
		// TODO 自动生成的方法存根
		noticeMapper.deleteByPrimaryKey(eid);
	}
}
