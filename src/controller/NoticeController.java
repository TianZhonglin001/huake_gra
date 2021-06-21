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
import bean.notice;
import service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	
	//检索
	@RequestMapping("/list")//管理员的路径
	public ModelAndView search(String nname,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<notice> page = noticeService.search(nname,pageNum);
		ModelAndView mv=new ModelAndView("notice/index");//管理员获得数据之后，携带数据返回到notice/index.jsp
		
		String queryResult = parseQueryString(nname);
		mv.addObject("page",page);
		mv.addObject("nname",nname);
		mv.addObject("queryResult",queryResult);
		return mv;
	}
	private String parseQueryString(String nname) {
		String result = "";
		if(nname != null && nname.trim() != "") {
			result=result+"&nname="+nname;
		}
		return result;
	} 
	//在学生界面显示公告
	@RequestMapping("/list_student")//学生页面的路径，他们请求的返回的数据是一样的（标题，内容，发布时间）
	public ModelAndView search2(String nname,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<notice> page = noticeService.search(nname,pageNum);
		ModelAndView mv=new ModelAndView("user_vision/index");//管理员获得数据之后，携带数据返回到user_vision/index.jsp.除此之外都是相同的。service层的作用是对数据库进行增删改查
		
		String queryResult = parseQueryString(nname);
		mv.addObject("page",page);
		mv.addObject("nname",nname);
		mv.addObject("queryResult",queryResult);
		return mv;
	}
	
	//添加
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public String save(notice notice,HttpServletRequest request) throws IllegalStateException, IOException {
			noticeService.save(notice);
			return "redirect:/notice/list";
		}
	//进入编辑
	@RequestMapping("edit/{nid}")
	public ModelAndView edit(@PathVariable("nid") Integer nid) {
		notice notice = noticeService.edit(nid);
		ModelAndView mv=new ModelAndView("notice/edit");
		mv.addObject("notice",notice);
		return mv;
	}
	
	//修改
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String update(notice notice,HttpServletRequest request) throws IllegalStateException, IOException{
		noticeService.update(notice);
		return "redirect:/notice/list";
	}
	//删除
		@RequestMapping("delete/{eid}")
		public String delete(@PathVariable("eid") Integer eid) {
			noticeService.delete(eid);
			return "redirect:/notice/list";
		}
}
