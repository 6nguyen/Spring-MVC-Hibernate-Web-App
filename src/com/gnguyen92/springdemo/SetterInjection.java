package com.gnguyen92.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {

	public static void main(String[] args) {

		// load the spring configuration xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from the Spring container
		// myGolfCoach is depency's bean id from applicationContext.xml
		// GolfCoach class used instead of Coach bc Coach doesn't have email or address methods
		GolfCoach theCoach = context.getBean("myGolfCoach", GolfCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getTrainingStatus());
		// call methods for literal value injection
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team Name: " + theCoach.getTeamName());
		
		// close the context
		context.close();
	}

}
