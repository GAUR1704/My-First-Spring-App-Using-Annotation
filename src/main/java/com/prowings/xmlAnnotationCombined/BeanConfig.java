package com.prowings.xmlAnnotationCombined;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
//@Component
//@Controller
//@Repository
//@Service
public class BeanConfig {

	@Bean
	//@Scope("prototype")
	//@Primary
	public static Bus getBus1() {

		return new Bus(10, "Audi", "Electric");
	}
	
	@Bean
	@Primary
	public static Bus getBus2() {
		
		return new Bus(20, "BMW", "TurboEngin");
	}

}
