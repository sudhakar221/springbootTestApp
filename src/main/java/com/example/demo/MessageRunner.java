package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {

	//modified by sudhakar login page 17/02/2021
	public void run(String... args) throws Exception {
		
		int a=10;
		int b=20;
		int c=a+b;
		
     System.out.println("Welcome to message runner");
     System.out.println("addition of two numbers is::"+c);

	}

}
