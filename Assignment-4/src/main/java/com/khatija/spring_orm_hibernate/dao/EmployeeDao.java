package com.khatija.spring_orm_hibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.khatija.spring_orm_hibernate.entity.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int addEmployee(Employee employee) {
	
		Integer rows = (Integer)hibernateTemplate.save(employee);
		return rows;
	}
   // get all employee
	public List<Employee> getAllEmployees(){
	List<Employee> employees=	hibernateTemplate.loadAll(Employee.class);
	return employees;
	}
	
	//get employee by id
	public Employee getEmployeeById(int id) {
     Employee employee	=	hibernateTemplate.get(Employee.class, id);
	 return employee;
	}
	
	
	//update Employee
	@Transactional
	public void updateEmployee(Employee employee) {
		hibernateTemplate.update(employee);
	}
	
	//delete employee
	@Transactional
	public void deleteEmployee(int id) {
		Employee employee = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(employee);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
