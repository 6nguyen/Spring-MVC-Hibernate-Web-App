package com.gnguyen92.springdemo;

public class BaseballCoach implements Coach{

	// define a private field for the dependency
	private TrainingStatus trainingStatus;
	
	// define a constructor for dependency injection
	public BaseballCoach(TrainingStatus trainingStatus){
		this.trainingStatus = trainingStatus;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes pitching and catching.";
	}

	@Override
	public String getTrainingStatus() {
		// use my TrainingStatus to get the trainingStatus
		return "Baseball is life. " + trainingStatus.getTrainingStatus();
	}
}
