package com.gnguyen92.springdemo;

public class poorTrainingStatus implements TrainingStatus {

	@Override
	public String getTrainingStatus() {
		return "You need more training...you're really falling behind.";
	}

}
