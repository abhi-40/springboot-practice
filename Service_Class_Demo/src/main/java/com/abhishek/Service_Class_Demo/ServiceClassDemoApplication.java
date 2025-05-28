package com.abhishek.Service_Class_Demo;

import com.abhishek.Service_Class_Demo.model.Laptop;
import com.abhishek.Service_Class_Demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceClassDemoApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(ServiceClassDemoApplication.class);

		Laptop lap=context.getBean(Laptop.class);
		LaptopService service=context.getBean(LaptopService.class);
		service.addLaptop(lap);


	}

}
