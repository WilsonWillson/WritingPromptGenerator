package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomSubject {
		
	static String heroCompare = "Hero";
	static String[] hero = {"soldier","firefighter", "police officer"};
	
	static String villianCompare = "Villian";
	static String[] villian = {"evil Mastermind","dictator",};

	static String professionCompare = "Profession";
	static String[] profession = {"baker","doctor","dentist", "nurse", "pharmacist", "physician", "software developer",
		"web developer", "dental hygienist", "veterinarian", "computer programmer", "iterpreter" ,
		"financial advisor", "therapist", "marriage counselor","lawyer", "accountant", "middle school teacher",
		"high school teacher", "teacher", "massage therapist", "paramedic", "hairdresser", "school counselor",
		"architect", "plumber", "artist", "barista", "auto mechanic", "bus driver", "cook", "receptionist", "secretary",
		"cashier", "janitor", "electrician", "delivery truck driver", "maid", "butler","security guard", "telemarketer",
		"consutrtion worker"};
	
	static String historicalFigureCompare = "Historical Figure";
	static String[] historicalFigure = {"George Washington","Abe Lincoln",};
    
	static String spaceCompare = "Space";
	static String[] space = {"astronaut","alien", ""};
	
	static String angelAndDemonsCompare = "Angels and Demons";
	static String[] angelAndDemons = {"Angel","Demon",};
	
	static String animalCompare = "Animal";
	static String[] animal = {"duck","elephant",};

	static String mythicalCreatureCompare = "Mythical Creatures";
	static String[] mythicalCreature = {"minotaur","pheonix",};
	
	static String medevilJobCompare = "Medevil Job";
	static String[] medevilJob = {"blacksmith","forger",};
	
	static String prehistoricSubjectCompare = "Prehistoric Subject";
	static String[] prehistoricSubject = {"caveman","dinosaur",};

	public static String RandomSubject(String subjectTopic){
		 String subject = " ";
		 	if(subjectTopic.equals(heroCompare)){
		 	 subject = (hero[new Random().nextInt(hero.length)]);
		 		return subject;
		 	}
		 	
		 	if(subjectTopic.equals(villianCompare)){
			 	 subject = (villian[new Random().nextInt(villian.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(professionCompare)){
			 	 subject = (profession[new Random().nextInt(profession.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(historicalFigureCompare)){
			 	 subject = (historicalFigure[new Random().nextInt(historicalFigure.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(spaceCompare)){
			 	 subject = (space[new Random().nextInt(space.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(angelAndDemonsCompare)){
			 	 subject = (angelAndDemons[new Random().nextInt(angelAndDemons.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(animalCompare)){
			 	 subject = (animal[new Random().nextInt(animal.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(mythicalCreatureCompare)){
			 	 subject = (mythicalCreature[new Random().nextInt(mythicalCreature.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(medevilJobCompare)){
			 	 subject = (medevilJob[new Random().nextInt(medevilJob.length)]);
			 		return subject;
			 	}
		 	if(subjectTopic.equals(prehistoricSubjectCompare)){
			 	 subject = (prehistoricSubject[new Random().nextInt(prehistoricSubject.length)]);
			 		return subject;
			 	}
		return null;	
	 }
}
