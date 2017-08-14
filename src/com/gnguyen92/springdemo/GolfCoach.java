package com.gnguyen92.springdemo;

public class GolfCoach implements Coach {

	private TrainingStatus trainingStatus;
	
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
