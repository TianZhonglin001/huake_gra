package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import bean.company;
import bean.companyExample;
import bean.companyExample.Criteria;
import dao.companyMapper;

@Service
public class CompanyService {
	@Autowired
	private companyMapper companyMapper;

	public PageInfo<company> search(String ename, Integer type, Integer pageNum) {
		companyExample companyexample=new companyExample();
		PageHelper.startPage(pageNum, 6);
		Criteria criteria =companyexample.createCriteria();
		if(ename != null && ename.trim() != "") {
			criteria.andEnameLike("%"+ename+"%");
		}
		if(type != null && type != 0) {
			criteria.andTypeEqualTo(type);
		}
		List<company> companylist = companyMapper.selectByExample(companyexample);
		PageInfo<company> page=new PageInfo<company>(companylist);
		return page;
	}

	public void save(company company) {
		// TODO 自动生成的方法存根
		companyMapper.insert(company);
	}


	public company edit(Integer eno) {
		company company = companyMapper.selectByPrimaryKey(eno);
		return company;
	}

	public void update(company company) {
		// TODO 自动生成的方法存根
		companyMapper.updateByPrimaryKeySelective(company);
	}

	public void delete(Integer eno) {
		// TODO 自动生成的方法存根
		companyMapper.deleteByPrimaryKey(eno);
	}


}
