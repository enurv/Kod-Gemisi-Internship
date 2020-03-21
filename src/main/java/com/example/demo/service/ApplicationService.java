package com.example.demo.service;

import com.example.demo.domain.Application;
import com.example.demo.domain.ApplicationFormDTO;

public interface ApplicationService {
	void addApplication(ApplicationFormDTO form);
	Iterable<Application> getApplicationByJobId(Long jobID);
}
