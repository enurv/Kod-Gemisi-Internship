package com.example.demo.repository;

import com.example.demo.domain.Job;
import com.example.demo.domain.User;
import com.example.demo.service.JobServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class InitDB implements CommandLineRunner {

    @Autowired
    private JobServiceImpl jobService;


    @Autowired
    private UserRepositoryDAO userRepository;

    @Override
    public void run(String... args) {
        Job job = new Job();
        job.setJobTitle("Web Developer");
        job.setJobDescription("Knows Spring Boot and Flask");
        job.setNumHire(2);
        job.setLastApplicationDate("23/03/20");

        Job job1 = new Job();
        job1.setJobTitle("Mobile Developer");
        job1.setJobDescription("Knows Dart and Flutter");
        job1.setNumHire(1);
        job1.setLastApplicationDate("23/03/20");
        
        Job job2 = new Job();
        job2.setJobTitle("Graphic Designer");
        job2.setJobDescription("Knows Photoshop and Illustrator");
        job2.setNumHire(1);
        job2.setLastApplicationDate("25/03/20");


        jobService.saveAll(Arrays.asList(job, job1, job2));

        User user = new User();
        
        user.setEmail("eda@gmail.com");
        user.setPassword("eda123");
        user.setName("Eda");
        user.setLastName("Var");
        

        userRepository.save(user);
        //System.out.println(user.getUsername());
    }
}
