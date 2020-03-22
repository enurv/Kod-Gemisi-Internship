package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.domain.Application;

public interface ApplicationRepositoryDAO extends JpaRepository<Application, Long> {

}
