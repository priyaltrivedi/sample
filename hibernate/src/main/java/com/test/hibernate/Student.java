package com.test.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	private String name;
	
	@Id
	private String rollno;
	private int marks;
	private Address address;
	
	public Student() {
		
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
