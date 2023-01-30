package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a default construcotr
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach : inside default constructor");
		fortuneService=theFortuneService;
	}
	/*
	 * //define a setter method
	 * 
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * fortuneService= theFortuneService; }
	 */
	
	
	//Spring will scan for component that implements FortuneService interface
	//	our example: HappyFortuneService meets the requirement
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
