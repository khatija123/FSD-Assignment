package com.khatija.spring_orm_hibernate;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.khatija.spring_orm_hibernate.dao.EmployeeDao;
import com.khatija.spring_orm_hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeeDao",EmployeeDao.class);
            
//        Employee obj= new Employee();
//        obj.setId(101);
//        obj.setName("Kulsum");
//        obj.setEmail("Kulsum@gmail.com");
        // int result = dao.addEmployee(obj);
        //System.out.println("("+result+"row inserted");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean flag = true;
        
        while(flag) {
        System.out.println("*****************************");
        System.out.println("Press 1: for insert");
        System.out.println("Press 2: for update");
        System.out.println("Press 3: for getAllRecord");
        System.out.println("Press 4: for getRecordById");
        System.out.println("Press 5: for delete");
        System.out.println("Press 6: Exit");
        System.out.println("*****************************");
        
        try {
			
        	int input = Integer.parseInt(br.readLine());
        	 switch (input) {
     		case 1:
     			//add employee
     			System.out.println("Enter employee id");
     			int id = Integer.parseInt(br.readLine());
     			
     			System.out.println("Enter employee name");
     			String name = br.readLine();

     			System.out.println("Enter employee email");
     			String email = br.readLine();
     			
     			Employee employee = new Employee(id, name, email);
     			dao.addEmployee(employee);
     			System.out.println("Employee record inserted successfully...");

     			break;
            case 2:
            	//update employee
            	
            	System.out.println("Enter employee id to update");
            	int id1 = Integer.parseInt(br.readLine());
            	
            	System.out.println("Enter employee name");
            	String name1 = br.readLine();
            	
            	System.out.println("Enter employee email");
            	String email1 = br.readLine();
            	
            	Employee employee1 = new Employee(id1, name1, email1);
            	
            	dao.updateEmployee(employee1);
            	System.out.println("Employee record updated successfully...");
     			
     			break;

            case 3:
     			List<Employee> employee3 = dao.getAllEmployees();
     			for(Employee empl : employee3) {
     				System.out.println(employee3);
     			}
     			break;
     			
            case 4:
            	//to getReocrd by id
     			 System.out.println("Enter id to get full information..");
     			 int id4 = Integer.parseInt(br.readLine());
     			Employee employee4= dao.getEmployeeById(id4);
     			System.out.println(employee4);
     			break;
     			
            case 5:
            	//to delete
     			System.out.println("Enter employee id to delete record");
     			int id5 = Integer.parseInt(br.readLine());
     			dao.deleteEmployee(id5);
     			System.out.println("Record deleted ....");
     			break;
     			
     		case 6:
     			System.out.println("Thank you...");
     			flag = false;
     		default:
     			break;
     		}
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        }
        
       
    }
}
