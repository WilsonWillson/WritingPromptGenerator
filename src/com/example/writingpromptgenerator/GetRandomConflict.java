package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomConflict {
	
	static String warCompare = "War";
	static String[] war = {"bombs","raid on an office"};
	
	static String dailyProblemsCompare = "Daily Problems";
	static String[] dailyProblems = {"getting to work","buying groceries", };
	
	static String horrorCompare = "Horror";
	static String[] horror = {"a killer is afoot","opening a puzzle box"};
	
	static String medevilCompare = "Medevil";
	static String[] medevil = {"raiding a castle","pillageing"};

	public static String RandomConflict(String conflictTopic){
		 String conflict = " ";
		 	if(conflictTopic.equals(warCompare)){
		 	 conflict = (war[new Random().nextInt(war.length)]);
		 		return conflict;
		 	}
		 	if(conflictTopic.equals(dailyProblemsCompare)){
			 	 conflict = (dailyProblems[new Random().nextInt(dailyProblems.length)]);
			 		return conflict;
			 	}
		 	if(conflictTopic.equals(horrorCompare)){
			 	 conflict = (horror[new Random().nextInt(horror.length)]);
			 		return conflict;
			 	}
		 	if(conflictTopic.equals(medevilCompare)){
			 	 conflict = (medevil[new Random().nextInt(medevil.length)]);
			 		return conflict;
			 	}
		return null;	
	 }
}
