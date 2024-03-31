package com.prowings.xmlAnnotationCombined2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig2 {

	
	@Bean("emp1")
	public Employee getEMployee1() {

		return new Employee(10, "Gaurav", new Address(10, "Pune", "India"));

	}
	
	@Bean
	public Employee getEMployee2() {
		
		return new Employee(20, "Atul", new Address(20, "Mumbai", "India"));
		
	}
	
	@Bean
	@Primary
	public Employee getEMployee3() {
		
		return new Employee(30, "Pratik", new Address(30, "Nagpur", "India"));
		
	}

}
