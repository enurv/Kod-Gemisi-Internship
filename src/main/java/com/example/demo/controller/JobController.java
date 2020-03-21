package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.JobAddFormDTO;
import com.example.demo.service.JobService;
import com.example.demo.service.UserService;

@Controller
public class JobController {
	private final JobService jobService;
    
    
    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
        
    }
    
	@RequestMapping("/jobs/add")
	    public ModelAndView jobAddPage() {
	        return new ModelAndView("addJob", "jobForm", new JobAddFormDTO());
	    }
	
	@RequestMapping(value = "/jobs", method = RequestMethod.POST)
	    public String handleJobAdd(@Valid @ModelAttribute("jobForm") JobAddFormDTO form, BindingResult bindingResult) {
	        if (bindingResult.hasErrors())
	            return "addJob";
	        
	        jobService.addJob(form);
	        return "redirect:/jobs";
	    }
	
	@RequestMapping("/jobs")
	public ModelAndView getJobssPage() {
	    return new ModelAndView("jobs", "jobs", jobService.getJobs());
	}
	
	@RequestMapping(value = "/jobs/{id}", method = RequestMethod.POST)
	public String handleJobDelete(@PathVariable("id") Long id) {
	    jobService.deleteJobById(id);
	    return "redirect:/jobs";
	}
}
