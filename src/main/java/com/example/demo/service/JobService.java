package com.example.demo.service;

import com.example.demo.domain.Job;
import com.example.demo.domain.JobAddFormDTO;

public interface JobService {
	void addJob(JobAddFormDTO form);
	Iterable<Job> getJobs();
	void deleteJobById(long id);
}
