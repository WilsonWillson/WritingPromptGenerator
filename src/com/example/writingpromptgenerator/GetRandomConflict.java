package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomConflict {
	
	static String warCompare = "War";
	static String[] war = {"blow up the world","raid an office", "defuse a bomb", "lead an army against the evil king",
				 "save Private Ryan", "overthrow a dictator", "inflitrate a goverment", "attack behind enemy lines", 
				 "save hostages", " attack the frontlines", " bomb a camp", " assassinate a dictator"};
	
	static String dailyProblemsCompare = "Daily Problems";
	static String[] dailyProblems = {"get to work","buy groceries", " avoid the boss while texting on the job and not doing any work", 
				" get out of traffic", " cook a meal", " succesfully go on a date", " unsueccesfully go on a date", 
				" take a test", " " };
	
	static String horrorCompare = "Horror";
	static String[] horror = {"find a killer","open a puzzle box", "kill a serial killer", ""};
	
	static String medevilCompare = "Medevil";
	static String[] medevil = {"raid a castle","pillage a village", "forge a mythical sword", "fight a dragon",
						" marry a princess", ""};
	
	static String technologyCompare = "Technology";
	static String[] technology = {" build a robot", " overthrow our robot overlords", " go back in time to safe JFK", 
					" go back to the future", " destroy the deathstar", " bodly go where no one has gone before", 
					" "};
	
	static String supernaturalCompare = "Supernatural";
	static String[] supernatural = {" find a ghost"," exorcise a demon"};
	
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
		 	if(conflictTopic.equals(selfCompare)){
			 	 conflict = (self[new Random().nextInt(self.length)]);
			 		return conflict;
			 	}
		return null;	
	 }
}
