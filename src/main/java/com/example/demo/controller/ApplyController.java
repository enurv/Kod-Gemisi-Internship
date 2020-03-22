package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.ApplicationFormDTO;
import com.example.demo.domain.JobAddFormDTO;
import com.example.demo.service.ApplicationService;
import com.example.demo.service.JobService;

@Controller
public class ApplyController {
	private final ApplicationService applicationService;
	private final JobService jobService;
    
    
    @Autowired
    public ApplyController(ApplicationService applicationService, JobService jobService) {
        this.jobService = jobService;
		this.applicationService = applicationService;
        
    }
    
	@RequestMapping(value = "/apply/{jobID}", method = RequestMethod.POST)
	    public ModelAndView applicationPage(@PathVariable("jobID") Long jobID) {
			ApplicationFormDTO form = new ApplicationFormDTO();
			form.setJobID(jobID);
			return new ModelAndView("application", "applicationForm", form);
			
	    }
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	    public String handleAdd(@Valid @ModelAttribute("applicationForm") ApplicationFormDTO form, BindingResult bindingResult) {
	        if (bindingResult.hasErrors())
	            return "application";
	        
	        applicationService.addApplication(form);
	        return "redirect:/apply";
	    }
	
	
	@RequestMapping("/apply")
	public ModelAndView getJobssPage() {
	    return new ModelAndView("apply", "jobs", jobService.getJobs());
	}
	
	/*
	@RequestMapping(value = "/apply/{id}", method = RequestMethod.POST)
	public String handle(@PathVariable("id") Long id) {
	    jobService.deleteJobById(id);
	    return "redirect:/jobs";
	}
	*/
}
