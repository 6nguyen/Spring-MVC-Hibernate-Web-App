package com.gnguyen92.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleDemo {

	public static void main(String[] args) {

		// Load spring xml config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		
		// retrieve bean
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// use methods on bean
		System.out.println(coach.getTrainingStatus());
		
		// close context
		context.close();
	}

}
