
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.JobRepositoryDAO;
import com.example.demo.repository.UserRepositoryDAO;

@Service
public class UserServiceImpl implements UserService, UserDetailsService{
	private final UserRepositoryDAO userRepository;

	@Autowired
    public UserServiceImpl(UserRepositoryDAO userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = getUserByUsername(username);
		if (null == user) {
		        throw new UsernameNotFoundException("User with username: " + username + " not found.");
		    } else {
		        return user;
		    }
	}

	private User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
