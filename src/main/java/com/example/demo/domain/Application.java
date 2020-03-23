package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Applications")
public class Application {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;
	@Column(name = "name", nullable = false)
    @Size(min=2, max=50)
    private String name;
	@Column(name = "email", nullable = false)
    @Size(min=2, max=50)
	private String email;
	@Column(name = "phone", nullable = false)
	private int phone;
	@Column(name = "adress", nullable = false)
	private String address;
	@Column(name = "thoughtsOnJob", nullable = false)
	private String thoughtsOnJob;
	@Column(name = "resume", nullable = false)
	private String resume;
	@Column(name = "jobID", nullable = false)
	private Long jobID;
	
	public Application() {
		
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
	public Application(@NotEmpty @Size(min = 2, max = 50) String name, @NotEmpty @Size(min = 2, max = 50) String email,
			int phone, @NotEmpty String address, @NotEmpty String thoughtsOnJob, @NotEmpty String resume, Long jobID) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.thoughtsOnJob = thoughtsOnJob;
		this.resume = resume;
		this.jobID = jobID;
	}
	
	@Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                ", Adress='" + address + '\'' +
                ", Thoughts On Job ='" + thoughtsOnJob + '\'' +
                ", Resume='" + resume + '\'' +
                ", JobID='" + jobID + '\'' +
                '}';
    }
}
