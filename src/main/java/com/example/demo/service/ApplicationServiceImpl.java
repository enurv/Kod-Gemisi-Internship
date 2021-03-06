package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Application;
import com.example.demo.domain.ApplicationFormDTO;
import com.example.demo.repository.ApplicationRepositoryDAO;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	private final ApplicationRepositoryDAO applicationRepository;
	
	
	@Autowired
    public ApplicationServiceImpl(ApplicationRepositoryDAO applicationRepository) {
        this.applicationRepository =applicationRepository;
    }
	
	
	@Override
	public void addApplication(ApplicationFormDTO form) {
		Application application = new Application(form.getName(), form.getEmail(), form.getPhone(), form.getAddress(), form.getThoughtsOnJob(), form.getResume(), form.getJobID());
		applicationRepository.save(application);
		//System.out.println(application.toString());
		
	}


	@Override
	public Iterable<Application> findByJobID(Long jobID) {
		return applicationRepository.findByjobID(jobID);
	}


	@Override
	public Iterable<Application> getApplications() {
		return applicationRepository.findAll();
	}
	

	

}
