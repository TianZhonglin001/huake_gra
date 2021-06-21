package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import bean.company;
import service.CompanyService;
import service.UserService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	//����Ա��ҳ�б���ʾ�������������ܣ�ɸѡ���ܣ���ҳ����
	@RequestMapping(value="/list")
	public ModelAndView search(String ename,Integer type,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<company> page = companyService.search(ename,type,pageNum);
		ModelAndView mv=new ModelAndView("company/index");
		
		String queryResult = parseQueryString(ename,type);
		mv.addObject("page",page);
		mv.addObject("ename",ename);
		mv.addObject("type",type);
		mv.addObject("queryResult",queryResult);
		return mv;
	}
	//ѧ����Ƹ����ҳ��ʾ
	@RequestMapping(value="/list_stu")
	public ModelAndView search1(String ename,Integer type,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<company> page = companyService.search(ename,type,pageNum);
		ModelAndView mv=new ModelAndView("user_vision/job_fair/index");
		
		String queryResult = parseQueryString(ename,type);
		mv.addObject("page",page);
		mv.addObject("ename",ename);
		mv.addObject("type",type);
		mv.addObject("queryResult",queryResult);
		return mv;
	}
	private String parseQueryString(String ename, Integer type) {
		String result = "";
		if(ename != null && ename.trim() != "") {
			result=result+"&ename="+ename;
		}
		if(type != null && type != 0) {
			result=result+"&type="+type;
		}
		return result;
	}
	
	//���
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(company company,HttpServletRequest request) throws IllegalStateException, IOException {
		companyService.save(company);
		return "redirect:/company/list";
	}
	
	//����Ա����޸�
	@RequestMapping("edit/{eno}")
	public ModelAndView edit(@PathVariable("eno") Integer eno) {
		company company = companyService.edit(eno);
		ModelAndView mv=new ModelAndView("company/edit");
		mv.addObject("company",company);
		return mv;
	}
	
	//�û���Ƹ������
	@RequestMapping("edit_stu/{eno}")
	public ModelAndView edit_stu(@PathVariable("eno") Integer eno) {
		company company = companyService.edit(eno);
		ModelAndView mv=new ModelAndView("user_vision/job_fair/deit");
		mv.addObject("company",company);
		return mv;
	}
	
	//�޸�
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String update(company company,HttpServletRequest request) throws IllegalStateException, IOException{
		companyService.update(company);
		return "redirect:/company/list";
	}
	
	//ɾ��
	@RequestMapping("delete/{eno}")
	public String delete(@PathVariable("eno") Integer eno) {
		companyService.delete(eno);
		return "redirect:/company/list";
	}
}
