package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.job;
import bean.user;
import dao.jobMapper;
@Service
public class JobService {
	@Autowired
	private jobMapper jobMapper;

	public void save(job job) {
		// TODO �Զ����ɵķ������
		System.out.print(job.getJsno());
		System.out.print(job.getJeno());
		System.out.print(job.getJid());
		jobMapper.insert(job);
	}


}
