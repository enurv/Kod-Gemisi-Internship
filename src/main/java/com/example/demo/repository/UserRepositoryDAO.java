
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.User;

public interface UserRepositoryDAO extends CrudRepository<User, Long> {

}
