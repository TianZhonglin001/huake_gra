package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import bean.job;
import bean.user;
import service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	private JobService jobService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(job job,MultipartFile resume,HttpServletRequest request) throws IllegalStateException, IOException {
		String realPath = request.getServletContext().getRealPath("/user/user_headimg");
		File directory= new File(realPath);
		if(!directory.exists()) {
			directory.mkdirs();
		}
		resume.transferTo(new File(realPath+"/"+resume.getOriginalFilename()));
		job.setJresume(resume.getOriginalFilename());
		jobService.save(job);
		return "redirect:/notice/list_student";
	}
}
