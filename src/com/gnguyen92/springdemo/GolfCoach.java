package com.gnguyen92.springdemo;

public class GolfCoach implements Coach {

	// INJECT LITERAL VALUES - add new fields for email address and team name
	private String email;
	private String teamName;
	
	private TrainingStatus trainingStatus;
	
	// INJECT LITERAL VALUES - create getters/setters for instance variables
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("GolfCoach: inside setEmail()");
		this.email = email;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		System.out.println("GolfCoach: inside setTeamName()");
		this.teamName = teamName;
	}

	
	public GolfCoach() {
		System.out.println("GolfCoach: inside default constructor.");
	}

	
	public void setTrainingStatus(TrainingStatus trainingStatus) {
		System.out.println("GolfCoach: inside setTraining()");
		this.trainingStatus = trainingStatus;
	}


	@Override
	public String getDailyWorkout() {
		return "Swingin' and puttin' all day baby!";
	}

	@Override
	public String getTrainingStatus() {
		return "Golf is about precision. " + trainingStatus.getTrainingStatus();
	}

}
