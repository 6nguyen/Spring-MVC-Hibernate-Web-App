package com.gnguyen92.springdemo;

public class randomTrainingStatus implements TrainingStatus {

	@Override
	public String getTrainingStatus() {
		String[] statuses = 
			{
			 "Well, you still need some more training.", 
			 "You're really starting to shape up.",
			 "I couldn't have asked for a better disciple."
			};
		int randIndex = (int)Math.floor(Math.random() * statuses.length);
		
		return statuses[randIndex];
	}

}
