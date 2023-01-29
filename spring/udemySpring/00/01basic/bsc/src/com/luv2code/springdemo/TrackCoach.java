package com.luv2code.springdemo;

import com.luv2code.service.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public TrackCoach() {};
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: "+ fortuneService.getFortune();
	}

}










