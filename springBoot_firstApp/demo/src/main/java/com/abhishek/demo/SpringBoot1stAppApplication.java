package com.abhishek.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1stAppApplication {

	public static void main(String[] args)
	{

		ApplicationContext context=SpringApplication.run(SpringBoot1stAppApplication.class);

		Alien obj=context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();
	}

}
