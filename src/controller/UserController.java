package controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RespectBinding;

import org.apache.taglibs.standard.tag.common.fmt.RequestEncodingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import bean.user;

import service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(user users,HttpSession session) {
		user users1=userService.login(users);
		if(users1 == null){
			return "redirect:login.jsp";
		}else {//已经在数据库中找到该用户
				if(users1.getDepartment()==1){
						session.setAttribute("loginUsers",users1);//找到的用户所有信息存放在session中，并且实例化，变量的名字为loginUsers
							return "redirect:/index.jsp";//返回到index.jsp时会将session一起返回
				}else{
					session.setAttribute("loginUsers",users1);
					return "redirect:/notice/list_student";//返回到notice注解（noticeConller）里
				}
		}
	}  
	
	@RequestMapping("/list")
	public ModelAndView search(String username,Integer department,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<user> page = userService.search(username,department,pageNum);
		ModelAndView mv=new ModelAndView("user/index");
		
		String queryResult = parseQueryString(username,department);
		mv.addObject("page",page);
		mv.addObject("username",username);
		mv.addObject("department",department);
		mv.addObject("queryResult",queryResult);
		return mv;
	}
	private String parseQueryString(String username, Integer department) {
		String result = "";
		if(username != null && username.trim() != "") {
			result=result+"&username="+username;
		}
		if(department != null && department != 0) {
			result=result+"&department="+department;
		}
		return result;
	} 
	
	//添加
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public String save(user user,MultipartFile pic,HttpServletRequest request) throws IllegalStateException, IOException {
			String realPath = request.getServletContext().getRealPath("/user/user_headimg");
			File directory= new File(realPath);
			if(!directory.exists()) {
				directory.mkdirs();
			}
			pic.transferTo(new File(realPath+"/"+pic.getOriginalFilename()));
			user.setPicture(pic.getOriginalFilename());
			userService.save(user);
			return "redirect:/User/list";
		}
		
		//进入编辑
		@RequestMapping("edit/{uid}")
		public ModelAndView edit(@PathVariable("uid") Integer uid) {
			user user = userService.detail(uid);
			ModelAndView mv=new ModelAndView("user/edit");
			mv.addObject("user",user);
			return mv;
		}
		
		//用户界面进入编辑
				@RequestMapping("edit_us/{uid}")
				public ModelAndView edit_us(@PathVariable("uid") Integer uid) {
					user user = userService.detail(uid);
					ModelAndView mv=new ModelAndView("user_vision/edit");
					mv.addObject("user",user);
					return mv;
				}
		
		//修改
		@RequestMapping(value="/update")
		public String update(user user,HttpServletRequest request) throws IllegalStateException, IOException{
			userService.update(user);
			return "redirect:/User/list";
		}
		
		//用户界面修改
				@RequestMapping(value="/update_us")
				public String update_us(user user,HttpServletRequest request) throws IllegalStateException, IOException{
					userService.update(user);
					return "redirect:/notice/list_student";
				}
		
		//详情
		@RequestMapping("/detail/{uid}")
		public ModelAndView customer_detail(@PathVariable("uid") Integer uid) {
			user user = userService.detail(uid);
			ModelAndView mv=new ModelAndView("user/look");
			mv.addObject("user",user);
			return mv;
		} 
		
		//删除
		@RequestMapping(value="/delete/{uid}")
		public String delete(@PathVariable("uid") Integer uid){
			userService.delete(uid);
			return "redirect:/User/list";
		}
}
