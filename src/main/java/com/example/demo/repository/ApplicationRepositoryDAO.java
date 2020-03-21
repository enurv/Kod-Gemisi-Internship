package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Application;

public interface ApplicationRepositoryDAO extends CrudRepository<Application, Long> {

}
