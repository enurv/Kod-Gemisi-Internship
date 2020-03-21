package com.example.demo.domain;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class JobAddFormDTO {
	@NotEmpty
    @Size(min=2, max=50)
    private String title;
	@NotEmpty
    @Size(min=2, max=50)
	private String description;
	@NotNull
	private int numberOfHire;
	@NotEmpty
    @Size(min=2, max=50)
	private String lastAppDate;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumberOfHire() {
		return numberOfHire;
	}
	public void setNumberOfHire(int numberOfHire) {
		this.numberOfHire = numberOfHire;
	}
	public String getLastAppDate() {
		return lastAppDate;
	}
	public void setLastAppDate(String lastAppDate) {
		this.lastAppDate = lastAppDate;
	}

	
}
