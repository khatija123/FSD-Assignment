package com.khatija.employeedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khatija.employeedemo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	 
	
	
}
