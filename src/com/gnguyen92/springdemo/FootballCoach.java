package com.gnguyen92.springdemo;

public class FootballCoach implements Coach{
	
	// define variable for dependency
	private TrainingStatus trainingStatus;
	
	// define constructor for dependency injection
	public FootballCoach(TrainingStatus trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Burpees, suicides, and tackles.  50 pushups now!";
	}

	@Override
	public String getTrainingStatus() {
		return "Football requires blood and sweat kiddo. " + trainingStatus.getTrainingStatus();
	}
}
