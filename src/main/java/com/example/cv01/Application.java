package com.example.cv01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Cv01Application {

	public static void main(String[] args) {
		SpringApplication.run(Cv01Application.class, args);
	}

	@Service
	public interface GreetingService  {

		void sayGreeting(String username);
	}

	public static class Greeter implements GreetingService {

		@Override
		public void sayGreeting(String username) {
			System.out.println("hi " + username);
		}
	}
}
