package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomSubject {
		
	static String heroCompare = "Hero";
	static String[] hero = {"soldier","firefighter", "police officer", "Mahatma Gandhi", "Nelson Mandela",
			"Martin Luther King Jr.", "John Rambo", "Forrest Gump", "Sherlock Holmes", "Frodo Baggins",
			"Rocky Balboa", "Han Solo", "Indiana Jones", "Spartacus", };
	
	static String villianCompare = "Villian";
	static String[] villian = {"evil Mastermind","dictator", "overlord", "tyrant", "Hitler",
	"evil genius", "Attila the Hun", "Vlad Dracula", "Jack the Ripper", "Buffalo Bill", "Hannibal lecter",
	"Ivan Drago","Norman Bates", "The Wicked Witch of the West", "Freddy Krueger" };

	static String professionCompare = "Profession";
	static String[] profession = {"baker","doctor","dentist", "nurse", "pharmacist", "physician", "software developer",
		"web developer", "dental hygienist", "veterinarian", "computer programmer", "iterpreter" ,
		"financial advisor", "therapist", "marriage counselor","lawyer", "accountant", "middle school teacher",
		"high school teacher", "teacher", "massage therapist", "paramedic", "hairdresser", "school counselor",
		"architect", "plumber", "artist", "barista", "auto mechanic", "bus driver", "cook", "receptionist", "secretary",
		"cashier", "janitor", "electrician", "delivery truck driver", "maid", "butler","security guard", "telemarketer",
		"consutrtion worker"};
	
	static String historicalFigureCompare = "Historical Figure";
	static String[] historicalFigure = {"George Washington","Abe Lincoln", "Napoleon", "William Shakespeare", "Aristotle",
		"Alexander the Great", "Thomas Jefferson", " Henry VIII of England", "Charlies Darwin", 
		"Elizabeth I of England", "Karl Marx", "Julius Caesar", "Martin Luther", "Queen Victoria", "Julius Caesar",
		"Martin Luther", "Joseph Stalin", "Albert Einstein", "Christopher Columbus", "Isaac Newton", "Theodore Roosevelt",
		"Mozart", "Plato", "Beethoven", "Leonardo da Vinci", "Ulysses S. Grant", "Benjamin Franklin", "Charles Dickens",
		"Ronald Reagan", "Genghis Khan", "Thomas Edison", "George W. Bush", "Franklin D. Roosevelt", "Sigmund Freud", 
		"Woodrow Wilson", "Mark Twain", "Edgar Allan Poe", "Andrew Jackson", "Elvis Presley", "John F. Kennedy", "Oscar Wilde",
		"King Arthur", "Michelangelo", "Nikola Tesla", "Joan of Arc", "Otto von Bismarck"};
    
	static String spaceCompare = "Space Fictional/Real";
	static String[] space = {"astronaut","alien", "little gray men", "scientist", "jedi", "stormtroppers", "bith", "cerean", 
		"corellian", "ewok", "gamorrean", "gungan", "hutt", "jawa", "kel dor", "rodian", "wookie", "vulcan", "andorian", "klingon",
		"Neil Armstrong", "Captain James T. Kirk", "Luke Skywalker", "Han Solo"};
	
	static String angelAndDemonsCompare = "Angels and Demons";
	static String[] angelAndDemons = {"angel","demon","fallen angel", "familiar", "jinn", "succubus",
		"imp", "poltergeist", "ghost", "spirt", "seraphim", "virtues", "principalities", "archangels",
		"devil", "dominions"};
	
	static String animalCompare = "Animal";
	static String[] animal = {"duck","elephant","tiger", "jaguar", "monkey", "dog", "lion", "weasel", 
		"deer", "octopus", "reindeer", "komodo dragon", "snake", "yak", "cheetah", "fish", "mole",
		"wolf", "zebra", "bear", "panda", "centipede", "quail", "gecko", "lizard", "dolphin", 
		"squirrel", "squid", "spider", "ants", "baboons", "sea lions", "orangutans", "pigeon", "crow",
		"donkey", "cow", "turkey","sheep", "racoon", "horse", "falcon", "rat", "owl", "whale", 
		"parrot", "pig", "chimpanzee"};

	static String mythicalCreatureCompare = "Mythical Creatures";
	static String[] mythicalCreature = {"minotaur","pheonix","dragon", "unicorn", "pegasus", "sphinx",
		"cerberus", "minotaur", "gargoyle", "ogre", "troll", "leviathan", "griffin", "leviathan", 
		"hydra", "centaur", "ghoul", "griffin", "harpy", "hippogriff", "chimera", "mermaid", "fairy",
		"medusa", "vampire", "cyclops", "basilisk", "golem", "imp", "sirens", "shapeshifters", "wisp"};
	
	static String medevilJobCompare = "Medevil Job";
	static String[] medevilJob = {"blacksmith","forger","apothecary", "artist", "armorer", "candlemaker", 
		"carpenter", "jester", "knight", "king", "prince", "painter ", "scribe", "serf", "vassal", 
		"nobel", "servant", "peasant", "assassin", "preist", "tailor", "falconer", "stonemason", 
		"miller", "fishmonger", "theif"};
	
	static String comicBookCompare = "Comic Book Characters";
	static String[] comicBook = {"Abe Sapien", "Hellboy", "Apocalypse", "Iron Fist", "Static Shock", 
		"Dr. Manhattan", "Galactus", "Bane", "Venom", "Silver Surfer", "Batwoman", "Deadpool",
		"Ultron", "Thanos", "Rorschach", "Hawkeye", "Nick Fury", "Beast", "Mr. Fantastic", 
		"Lex Luthor", "V", "Doctor Strange", "Green Goblin", "Fone Bone", "Robin", "Storm", "Hulk",
		"Thor", "Swamp Thing", "Jean Grey", "Judge Dredd", "The Flash", "Iron Man", "The Thing", 
		"Green Latern", "Dr. Doom", "Professor X", "John Constantine", "Magneto", "Wolverine", 
		"Captain America", "Morpheus", "Wonder Woman", "Daredevil", "The Joker", "Superman", 
		"Batman", "Spider-Man", "The Human Torch"};

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
		return null;	
	 }
}
