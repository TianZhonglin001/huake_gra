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
	
	//����
	@RequestMapping("/list")//����Ա��·��
	public ModelAndView search(String nname,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<notice> page = noticeService.search(nname,pageNum);
		ModelAndView mv=new ModelAndView("notice/index");//����Ա�������֮��Я�����ݷ��ص�notice/index.jsp
		
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
	//��ѧ��������ʾ����
	@RequestMapping("/list_student")//ѧ��ҳ���·������������ķ��ص�������һ���ģ����⣬���ݣ�����ʱ�䣩
	public ModelAndView search2(String nname,@RequestParam(value="pageNum",required=false,defaultValue="1") Integer pageNum) {
		PageInfo<notice> page = noticeService.search(nname,pageNum);
		ModelAndView mv=new ModelAndView("user_vision/index");//����Ա�������֮��Я�����ݷ��ص�user_vision/index.jsp.����֮�ⶼ����ͬ�ġ�service��������Ƕ����ݿ������ɾ�Ĳ�
		
		String queryResult = parseQueryString(nname);
		mv.addObject("page",page);
		mv.addObject("nname",nname);
		mv.addObject("queryResult",queryResult);
		return mv;
	}
	
	//���
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public String save(notice notice,HttpServletRequest request) throws IllegalStateException, IOException {
			noticeService.save(notice);
			return "redirect:/notice/list";
		}
	//����༭
	@RequestMapping("edit/{nid}")
	public ModelAndView edit(@PathVariable("nid") Integer nid) {
		notice notice = noticeService.edit(nid);
		ModelAndView mv=new ModelAndView("notice/edit");
		mv.addObject("notice",notice);
		return mv;
	}
	
	//�޸�
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String update(notice notice,HttpServletRequest request) throws IllegalStateException, IOException{
		noticeService.update(notice);
		return "redirect:/notice/list";
	}
	//ɾ��
		@RequestMapping("delete/{eid}")
		public String delete(@PathVariable("eid") Integer eid) {
			noticeService.delete(eid);
			return "redirect:/notice/list";
		}
}
