package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring confituration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call methods on the bean
		//.. let's come back to this...
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods to get the literal values
		//해당 매소드를 호출,모든값은 주입되었으므로 
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}	

}
