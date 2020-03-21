package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Job;

public interface JobRepositoryDAO extends CrudRepository<Job, Long> {

}
