package com.khatija.spring_orm_hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_data")
public class Employee {
     
	@Id
	@Column(name="empl_id")
	private int id;
	
	@Column(name="empName")
	private String name;
	
	@Column(name="emp_email")
	private String email;
	
	
	public Employee() {
		
	}
	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
