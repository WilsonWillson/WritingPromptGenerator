package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomSubject {
		
	static String heroCompare = "Hero";
	static String[] hero = {"a soldier","a firefighter", "a police officer", "Mahatma Gandhi", "Nelson Mandela",
			"Martin Luther King Jr.", "John Rambo", "Forrest Gump", "Sherlock Holmes", "Frodo Baggins",
			"Rocky Balboa", "Han Solo", "Indiana Jones", "Spartacus", };
	
	static String villianCompare = "Villian";
	static String[] villian = {"an evil Mastermind","a dictator", "a overlord", "a tyrant", "Hitler",
	"an evil genius", "Attila the Hun", "Vlad Dracula", "Jack the Ripper", "Buffalo Bill", "Hannibal lecter",
	"Ivan Drago","Norman Bates", "The Wicked Witch of the West", "Freddy Krueger" };

	static String professionCompare = "Profession";
	static String[] profession = {"a baker","a doctor","a dentist", "a nurse", "a pharmacist", "a physician", "a software developer",
		"a web developer", "a dental hygienist", "a veterinarian", "a computer programmer", "a iterpreter" ,
		"a financial advisor", "a therapist", "a marriage counselor","a lawyer", "an accountant", "a middle school teacher",
		"a high school teacher", "a teacher", "a massage therapist", "a paramedic", "a hairdresser", "a school counselor",
		"an architect", "plumber", "an artist", "a barista", "an auto mechanic", "a bus driver", "a cook", "a receptionist", "a secretary",
		"a cashier", "a janitor", "a electrician", "a delivery truck driver", "a maid", "a butler","a security guard", "a telemarketer",
		"a consutrtion worker"};
	
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
	static String[] space = {"an astronaut","an alien", "little gray men", "a scientist", "a jedi", "a stormtroppers", "a bith", "a cerean", 
		"a corellian", "a ewok", "a gamorrean", "a gungan", "a hutt", "a jawa", "a kel dor", "a rodian", "a wookie", "a vulcan", "an andorian", "a klingon",
		"Neil Armstrong", "Captain James T. Kirk", "Luke Skywalker", "Han Solo"};
	
	static String angelAndDemonsCompare = "Angels and Demons";
	static String[] angelAndDemons = {"an angel","a demon","a fallen angel", "a familiar", "a jinn", "a succubus",
		"a imp", "a poltergeist", "a ghost", "a spirt", "a seraphim", "a virtue", "a principalitie", "a archangel",
		"a devil", "a dominion"};
	
	static String animalCompare = "Animal";
	static String[] animal = {"a duck","a elephant","a tiger", "a jaguar", "a monkey", "a dog", "a lion", "a weasel", 
		"a deer", "a octopus", "a reindeer", "a komodo dragon", "a snake", "a yak", "a cheetah", "a fish", "a mole",
		"a wolf", "a zebra", "a bear", "a panda", "a centipede", "a quail", "a gecko", "a lizard", "a dolphin", 
		"a squirrel", "squid", "a spider", "a ant", "a baboons", "a sea lion", "a orangutans", "a pigeon", "a crow",
		"a donkey", "a cow", "a turkey","a sheep", "a racoon", "a horse", "a falcon", "a rat", "a owl", "a whale", 
		"a parrot", "a pig", "a chimpanzee"};

	static String mythicalCreatureCompare = "Mythical Creatures";
	static String[] mythicalCreature = {"a minotaur","a pheonix","a dragon", "a unicorn", "a pegasus", "a sphinx",
		"a cerberus", "a minotaur", "a gargoyle", "a ogre", "a troll", "a leviathan", "a griffin", "a leviathan", 
		"a hydra", "a centaur", "a ghoul", "a griffin", "a harpy", "hippogriff", "a chimera", "a mermaid", "a fairy",
		"a medusa", "a vampire", "a cyclops", "a basilisk", "a golem", "a imp", "a siren", "a shapeshifter", "a wisp"};
	
	static String medevilJobCompare = "Medevil Job";
	static String[] medevilJob = {"a blacksmith","a forger","a apothecary", "an artist", "an armorer", "a candlemaker", 
		"a carpenter", "a jester", "a knight", "a king", "a prince", "a painter ", "a scribe", "a serf", "a vassal", 
		"a nobel", "a servant", "a peasant", "an assassin", "a preist", "a tailor", "a falconer", "a stonemason", 
		"a miller", "a fishmonger", "a theif"};
	
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
		 	if(subjectTopic.equals(comicBookCompare)){
			 	 subject = (comicBook[new Random().nextInt(comicBook.length)]);
			 		return subject;
			 	}
		return null;	
	 }
}
