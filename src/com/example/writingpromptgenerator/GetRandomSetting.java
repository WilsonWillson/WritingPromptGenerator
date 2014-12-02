package com.example.writingpromptgenerator;

import java.util.Random;


public class GetRandomSetting {
	
	static String fiftyStatesCompare = "The Fifty States";
	static String[] theFiftyStates = {"Alabama", "Alaska", "Arizona","Arkansas","California",
		"Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii","Idaho",
		"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
		"Maryland","Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
		"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey","New Mexico",
		"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon","Pennsylvania",
		"Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah",
		"Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
	
	static String americaCompare = "America";
	static String[]america ={"Small Town", "Yellowstone"};
		
	static String horrorLocationsCompare = "Horror Settings";
	static String[]horrorLocations = {"Camp Crystal Lake", "Elm Street", "a cabin in the woods"};
		
	public static String RandomSetting(String settingTopic){
		 String setting = " ";
		 	if(settingTopic.equals(fiftyStatesCompare)){
		 	 setting = (theFiftyStates[new Random().nextInt(theFiftyStates.length)]);
		 		return setting;
		 	}
		 	else if(settingTopic.equals(americaCompare)){
			 	 setting = (america[new Random().nextInt(america.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(horrorLocationsCompare)){
			 	 setting = (horrorLocations[new Random().nextInt(horrorLocations.length)]);
			 		return setting;
			 	}
		 	else{
		 		return null;	
		 	}
	 }
}
