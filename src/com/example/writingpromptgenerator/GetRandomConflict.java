package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomConflict {
	
	static String warCompare = "War";
	static String[] war = {"blow up the world","raid an office", "defuse a bomb", "lead an army against the evil king",
		""};
	
	static String dailyProblemsCompare = "Daily Problems";
	static String[] dailyProblems = {"getting to work","buy groceries", };
	
	static String horrorCompare = "Horror";
	static String[] horror = {"a killer is afoot and you have to find him","open a puzzle box"};
	
	static String medevilCompare = "Medevil";
	static String[] medevil = {"raid on a castle","pillage"};
	
	static String technologyCompare = "Technology";
	static String[] technology = {"raid on a castle","pillage"};
	
	static String supernaturalCompare = "Supernatural";
	static String[] supernatural = {"raid on a castle","pillage"};
	
	static String societyCompare = "Society";
	static String[] society = {"raid on a castle","pillage"};
	
	static String selfCompare = "Self";
	static String[] self = {"raid on a castle","pillage"};

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
		 	if(conflictTopic.equals(technologyCompare )){
			 	 conflict = (technology[new Random().nextInt(technology.length)]);
			 		return conflict;
			 	}
		 	if(conflictTopic.equals(supernaturalCompare)){
			 	 conflict = (supernatural[new Random().nextInt(supernatural.length)]);
			 		return conflict;
			 	}
		 	if(conflictTopic.equals(societyCompare)){
			 	 conflict = (society[new Random().nextInt(society.length)]);
			 		return conflict;
			 	}
		 	if(conflictTopic.equals(selfCompare)){
			 	 conflict = (self[new Random().nextInt(self.length)]);
			 		return conflict;
			 	}
		return null;	
	 }
}
