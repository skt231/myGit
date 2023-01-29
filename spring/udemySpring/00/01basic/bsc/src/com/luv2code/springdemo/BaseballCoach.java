package com.luv2code.springdemo;

import com.luv2code.service.FortuneService;

public class BaseballCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//dependency=helper
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
