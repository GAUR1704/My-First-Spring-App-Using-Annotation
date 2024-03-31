package com.prowings.xmlAnnotationCombined2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeConfig {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans2.xml");
		
		Employee emp = context.getBean("emp1",Employee.class);
		
		System.out.println(emp);
		
		Employee emp2= context.getBean(Employee.class);
		
		System.out.println(emp2);
		
		
		
	}

}
