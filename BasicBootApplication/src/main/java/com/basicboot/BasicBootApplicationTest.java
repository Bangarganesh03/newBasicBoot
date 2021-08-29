package com.basicboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.basicboot.beans.Bike;

@SpringBootApplication
public class BasicBootApplicationTest {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BasicBootApplicationTest.class, args);
		Bike bike= context.getBean(Bike.class);
		
		System.out.println(bike);

	}

}
