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
	
	//管理员主页列表显示，包括搜索功能，筛选功能，分页功能
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
	//学生招聘会主页显示
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
	
	//添加
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(company company,HttpServletRequest request) throws IllegalStateException, IOException {
		companyService.save(company);
		return "redirect:/company/list";
	}
	
	//管理员点击修改
	@RequestMapping("edit/{eno}")
	public ModelAndView edit(@PathVariable("eno") Integer eno) {
		company company = companyService.edit(eno);
		ModelAndView mv=new ModelAndView("company/edit");
		mv.addObject("company",company);
		return mv;
	}
	
	//用户招聘会详情
	@RequestMapping("edit_stu/{eno}")
	public ModelAndView edit_stu(@PathVariable("eno") Integer eno) {
		company company = companyService.edit(eno);
		ModelAndView mv=new ModelAndView("user_vision/job_fair/deit");
		mv.addObject("company",company);
		return mv;
	}
	
	//修改
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String update(company company,HttpServletRequest request) throws IllegalStateException, IOException{
		companyService.update(company);
		return "redirect:/company/list";
	}
	
	//删除
	@RequestMapping("delete/{eno}")
	public String delete(@PathVariable("eno") Integer eno) {
		companyService.delete(eno);
		return "redirect:/company/list";
	}
}
