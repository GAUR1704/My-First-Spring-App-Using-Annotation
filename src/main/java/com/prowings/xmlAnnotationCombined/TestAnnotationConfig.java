package com.prowings.xmlAnnotationCombined;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
//		Car car = context.getBean("car" ,Car.class);
//		
//		System.out.println(car);
//		
//		Bike bike1 = context.getBean("bike" , Bike.class);
//		
//		System.out.println((bike1));
		
		Bus bus1 = context.getBean(Bus.class);
		
		System.out.println(bus1);
		
		
		/*
		 * Bus bus2 = context.getBean("getBus2" ,Bus.class);
		 * 
		 * System.out.println(bus2);
		 */
				

	}

}
