package com.gnguyen92.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);

		
		// check if they are the same object
		boolean sameAddress = (coach1 == coach2);
		
		// print out results
		System.out.println("Pointing to the same object: " + sameAddress);
		System.out.println("Memory location for coach1: " + coach1);
		System.out.println("Memory location for coach2: " + coach2);
		
		// close context
		context.close();
	}

}
