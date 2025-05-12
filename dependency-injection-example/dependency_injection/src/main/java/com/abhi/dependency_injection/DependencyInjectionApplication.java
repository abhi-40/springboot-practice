package com.abhi.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DependencyInjectionApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.code();
	}

}
