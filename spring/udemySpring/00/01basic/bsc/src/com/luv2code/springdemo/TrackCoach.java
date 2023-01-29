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
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyStartupStuffYoYo");
	}
}










