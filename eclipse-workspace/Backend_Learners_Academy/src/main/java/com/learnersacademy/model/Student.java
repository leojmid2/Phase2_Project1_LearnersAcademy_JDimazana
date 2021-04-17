package com.learnersacademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student") 
public class Student {

	@Id
	@Column(name="studentid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentid;
	
	@Column(name="firstname")
	private String fistname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contact")
	private String contact;

	public Student(String fistname, String lastname, String email, String address, String contact) {
		super();
		this.fistname = fistname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Long getStudentid() {
		return studentid;
	}
	
	
	
	
}
