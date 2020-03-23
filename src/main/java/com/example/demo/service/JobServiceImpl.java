package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Application;
import com.example.demo.domain.Job;
import com.example.demo.domain.JobAddFormDTO;
import com.example.demo.repository.ApplicationRepositoryDAO;
import com.example.demo.repository.JobRepositoryDAO;
import com.example.demo.service.UserService;

@Service
public class JobServiceImpl implements JobService{
	private final JobRepositoryDAO jobRepository;
	private final ApplicationRepositoryDAO applicationRepository;
	
	
	@Autowired
    public JobServiceImpl(JobRepositoryDAO jobRepository, ApplicationRepositoryDAO applicationRepository) {
        this.jobRepository = jobRepository;
        this.applicationRepository = applicationRepository;
        
    }
	
	@Override
	public void addJob(JobAddFormDTO form) {
		
        Job job = new Job(form.getTitle(), form.getDescription(), form.getNumberOfHire(), form.getLastAppDate());
        jobRepository.save(job);
        //System.out.println(jobRepository.findById(job.getId()));
	}
	
	public void saveAll(List<Job> jobs) {
        jobRepository.saveAll(jobs);
    }

	@Override
	public Iterable<Job> getJobs() {
		return jobRepository.findAll();
	}

	@Override
	public void deleteJobById(long id) {
		jobRepository.deleteById(id);
		
		
	}

	@Override
	public List<Application> seeApplicationsByJobID(Long ID) {
		return (List<Application>) applicationRepository.findByjobID(ID);
	}

}
