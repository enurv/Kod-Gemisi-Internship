package com.example.demo.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class ApplicationFormDTO {
	@NotEmpty
    @Size(min=2, max=50)
    private String name;
	@NotEmpty
    @Size(min=2, max=50)
	private String email;
	@NotNull
	private int phone;
	@NotEmpty
	private String address;
	@NotEmpty
	private String thoughtsOnJob;
	@NotEmpty
	private String resume;
	@NotNull
	private Long jobID;
	
	
	public ApplicationFormDTO(@NotEmpty @Size(min = 2, max = 50) String name,
			@NotEmpty @Size(min = 2, max = 50) String email, int phone, @NotEmpty String address,
			@NotEmpty String thoughtsOnJob, @NotEmpty String resume, Long jobID) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.thoughtsOnJob = thoughtsOnJob;
		this.resume = resume;
		this.jobID = jobID;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getThoughtsOnJob() {
		return thoughtsOnJob;
	}
	public void setThoughtsOnJob(String thoughtsOnJob) {
		this.thoughtsOnJob = thoughtsOnJob;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Long getJobID() {
		return jobID;
	}
	public void setJobID(Long jobID) {
		this.jobID = jobID;
	}
	
	public ApplicationFormDTO() {
		
	}
	
}
