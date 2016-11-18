package org.launchcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
//this code is what makes the whole program run
	//it uses the spring framework to tie it all together
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
}
