package com.example.demo.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.Application;

public interface ApplicationRepositoryDAO extends CrudRepository<Application, Long> {
	//@Query(value = "SELECT * FROM Applications deneme WHERE deneme.jobID = jobId", nativeQuery = true) 
	public Iterable<Application> findByjobID(Long jobId);
	
}
