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
import bean.situation;
import service.SituationService;

@Controller
@RequestMapping("/situation")
public class SituationController {
	@Autowired
	private SituationService situationService;
	
	//主页列表显示，包括搜索功能，筛选功能，分页功能
		@RequestMapping(value="/list")
		public ModelAndView search(String sname,String smajor,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
			PageInfo<situation> page = situationService.search(sname,smajor,pageNum);
			ModelAndView mv=new ModelAndView("situation/index");
			
			String queryResult = parseQueryString(sname,smajor);
			mv.addObject("page",page);
			mv.addObject("sname",sname);
			mv.addObject("smajor",smajor);
			mv.addObject("queryResult",queryResult);
			return mv;
		}
		private String parseQueryString(String sname, String smajor) {
			String result = "";
			if(sname != null && sname.trim() != "") {
				result=result+"&sname="+sname;
			}
			if(smajor != null && smajor.trim() != "") {
				result=result+"&smajor="+smajor;
			}
			return result;
		}
		
		//学生添加就业情况
		//添加
		@RequestMapping(value="/add",method=RequestMethod.POST)
		public String save(situation situation,HttpServletRequest request) throws IllegalStateException, IOException {
			situationService.add(situation);
			return "redirect:/notice/list_student";
		}
		
		//管理员查看就业情况
		@RequestMapping("edit/{sno}")
		public ModelAndView edit(@PathVariable("sno") String sno) {
			situation situation = situationService.edit(sno);
			ModelAndView mv=new ModelAndView("situation/deit");
			mv.addObject("situation",situation);
			return mv;
		}
		//学生修改就业情况
		@RequestMapping("edit_stu1/{sno}")
		public ModelAndView edit_stu1(@PathVariable("sno") String sno) {
			situation situation = situationService.edit(sno);
			ModelAndView mv=new ModelAndView("user_vision/information/update");
			mv.addObject("situation",situation);
			return mv;
		}
		//学生查看就业情况
		@RequestMapping("edit_stu/{sno}")
		public ModelAndView edit_stu(@PathVariable("sno") String sno) {
			situation situation = situationService.edit(sno);
			ModelAndView mv=new ModelAndView("user_vision/information/index");
			mv.addObject("situation",situation);
			return mv;
		}
		
		//管理员修改
		@RequestMapping(value="/update",method=RequestMethod.PUT)
		public String update(situation situation,HttpServletRequest request) throws IllegalStateException, IOException{
			situationService.update(situation);
			return "redirect:/situation/list";
		}
		//学生修改
		@RequestMapping(value="/update_stu",method=RequestMethod.PUT)
		public String update_stu(situation situation,HttpServletRequest request) throws IllegalStateException, IOException{
			situationService.update(situation);
			return "redirect:/notice/list_student";
		}
}
