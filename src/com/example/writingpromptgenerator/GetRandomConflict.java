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
				" take a test", " pay the bills", " interviewing for a job", " buy trendy clothes", " pull an all-nighter", 
				" watch reality TV", " find love", "park a hummer in a compact parking spot" ," find a torrent for that new hipster indie band",
				" figure out your ex-girlfriend's new Netflix password"};
	
	static String horrorCompare = "Horror";
	static String[] horror = {"find a killer","open a puzzle box", "kill a serial killer", " infltrate a cult", 
		" catch a werewolf", " stop Frankenstien's monster", " kill Dracula", " find a sexy Vampire Husband",
		"find the blair witch", " survive the zombie apocalypse", " destroy a sharknado", " kill King Kong", 
		"safe King Kong", " kill Godzilla", " help Godzilla kill Mechagodzilla", 
		"take Pete's car, drive over to Mum's, go in, take care of Philip, then grab Mum, go over to Lizs place, hole up, have a cup of tea and wait for this whole thing to blow over.", 
		" survive the Wicker Man festival", " catch the Phantom of the Opera", "find an american werewolf in london",
		" escape a collpased cave", " explore the pyramids", " figure out who the killer is at the party"};
	
	static String medevilCompare = "Medieval";
	static String[] medevil = {"raid a castle","pillage a village", "forge a mythical sword", "fight a dragon",
						" marry a princess", " win a jousting competition", " fight in the crusades", 
						"reclaim your rightful place on the throne", " lead a rebillion against an evil king", 
						" survive the black plauge", "fight the black knight", "catch Robin Hood", "team up with Robin Hood"};
	
	static String technologyCompare = "Technology";
	static String[] technology = {" build a robot", " overthrow our robot overlords", " go back in time to safe JFK", 
					" go back to the future", " destroy the deathstar", " bodly go where no one has gone before", 
					" teach a robot to love", " stop the goverment from burning books", " escape the Matrix", 
					" use the force", " go back to the future to help your parents fall in love", " escape from Jurassic Park",
					" stop aliens from destroying the Earth", " help an alien return home", " destroy an alien planet because they are different than us",
					" figure out what happens next time on Dragon Ball Z", "unite the dark side and light side of the force"};
	
	static String supernaturalCompare = "Supernatural";
	static String[] supernatural = {"communicate with a ghost","exorcise a demon", "explore ancient tombs", "stop a cult from resurrecting a demon",
		"catch a ghost", "watch a tape that kills you after 7 days", "explore a haunted house", "find old mysterious tapes with haunting images on them",
		"call the ghostbusters", "team up with the ghostbusters", "tape an episode of Ghost Hunters", "fall in love with a ghost"};
	
	static String selfCompare = "Self";
	static String[] self = {"discover the true meaning of life","find love", "become a better person", "develop an exercise schedule and actually stick to it",
		"stick to a new years resolution", "overcome his/her own disbelif and accomplish a goal", "overcome a character flaw", 
		"stop being a jerk"};

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
