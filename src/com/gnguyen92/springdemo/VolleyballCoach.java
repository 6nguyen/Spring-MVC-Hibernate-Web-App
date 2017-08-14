package com.gnguyen92.springdemo;

public class VolleyballCoach implements Coach {

	// define private field for dependency
	private TrainingStatus trainingStatus;
	
	// define constructor for dependency injection
	public VolleyballCoach(TrainingStatus trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	@Override
	public String getDailyWorkout() {
		return "Get, set, net, GO!  I want to see some perfect spikes today ladies.";
	}

	@Override
	public String getTrainingStatus() {
		return "This is volleyball, kid. " + trainingStatus.getTrainingStatus();
	}
	
	
	
}
