package com.example.cv01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application extends Greeter {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

}
