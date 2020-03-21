package com.example.demo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    	private long id;
    @Column(name = "jobTitle", nullable = false, updatable = true, unique = false)
    	private String jobTitle;
    @Column(name = "jobDescription", nullable = false)
    	private String jobDescription;
    @Column(name = "numHire", nullable = false)
	private int numHire;
    @Column(name = "lastApplicationDate")
    private String lastApplicationDate;
    
    public Job() {
    }
    
	public Job(String jobTitle, String jobDescription, int numHire, String lastApplicationDate) {
	        this.jobTitle = jobTitle;
	        this.jobDescription = jobDescription;
	        this.numHire = numHire;
	        this.lastApplicationDate = lastApplicationDate;
	    }

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getNumHire() {
		return numHire;
	}

	public void setNumHire(int numHire) {
		this.numHire = numHire;
	}

	public String getLastApplicationDate() {
		return lastApplicationDate;
	}

	public void setLastApplicationDate(String lastApplicationDate) {
		this.lastApplicationDate = lastApplicationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", Job Title='" + jobTitle + '\'' +
                ", Job Description='" + jobDescription + '\'' +
                ", Number of People to Hire='" + numHire + '\'' +
                ", Last Application Date='" + lastApplicationDate + '\'' +
                '}';
    }
	
}
