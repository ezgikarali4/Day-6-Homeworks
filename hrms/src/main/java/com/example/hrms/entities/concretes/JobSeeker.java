package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers")
public class JobSeeker extends User{

	@Id 
	@GeneratedValue 
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String webPage;
	
	@Column(name = "id_number")
	private String companyEmail;
	
	@Column(name = "birth_date")
	private String birthYear;
	
	@Column(name = "email")
	private String email;
	
	public JobSeeker() {
		
	}

	public JobSeeker(int id, String firstName, String webPage, String companyEmail, String birthYear, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.webPage = webPage;
		this.companyEmail = companyEmail;
		this.birthYear = birthYear;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
