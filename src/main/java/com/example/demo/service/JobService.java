package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Application;
import com.example.demo.domain.Job;
import com.example.demo.domain.JobAddFormDTO;

public interface JobService {
	void addJob(JobAddFormDTO form);
	Iterable<Job> getJobs();
	void deleteJobById(long id);
	List<Application> seeApplicationsByJobID(Long ID);
}
