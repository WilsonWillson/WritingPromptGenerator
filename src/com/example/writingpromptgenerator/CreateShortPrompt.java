package com.example.writingpromptgenerator;

import java.util.Random;

public class CreateShortPrompt {
	
	public static String CreateSentence( ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(40) + 1;
	switch (choice) {
    case 1:  sentence = "The inner monologue of an idiot turning into a genius within minutes.";
             break;
    case 2:  sentence = "Write a very dark story in the universe of a children's cartoon.";
             break;
    case 3:  sentence = "Make me gag with a vivid description of an everyday object.";
             break;
    case 4:  sentence = "Break my heart in a sentence.";
             break;
    case 5:  sentence = "There's a reason dermatologists hate him.";
    		 break;
    case 6:  sentence = " Dr. Seuss writes a horror story.";
	 		 break;
    case 7:  sentence = " Write a Tweet in the writing style of any writer, living or dead.";
	 		 break;	
    case 8:	 sentence = "  Make an emotionally manipulative character. Make that character the narrator. " +
    		"Manipulate the other characters. While you manipulate me, the reader.";
	          break;	
    case 9:  sentence = "A drug for eternal life has been developed. There's only one catch...";
    		 break;	
    case 10: sentence = "An alien abuduction goes wrong when the aliens abduct another alien in disguise.";
    		 break;
    case 11: sentence = "Instead of wars, countries use rap battles. Write a battle between two enemy countries.";
	 		 break;	
    case 12: sentence = "Every online-dater's worst fear is meeting up with a serial killer. By chance, " +
    					" two unaware serial killers agree to meet each other.";
	 			break;
    case 13: sentence = "Write about a totally normal day in 2014, written as a 1950's sci-fi story about living in the 21st century.";
	 			break;	
    case 14: sentence = " The narrator slowly falls in love with the antagonist. The protagonist tries to win the narrator back.";
				break;	
    case 15: sentence = " The Earth does not rotate. One side always faces the sun and is in continual daylight. " +
    					"The other side is in eternal night. Cultures on both side develop around this.";
				break;	
    case 16: sentence = "CIA April fools joke gets out of hand.";
				break;
    case 17: sentence = "A spooky skeleton is popping up throughout your story. Spook me.";
				break;
    case 18: sentence = "A village is being savaged by the most passive aggressive wizard ever.";
    			break;
    case 19: sentence = "Kanye West is one of the four Kanye's. The other three being Kanye North, Kanye South, and Kanye East." +
    		"			 More commonly known as the Four Kanye's of the Apocalypse.";
				break;
    case 20: sentence = "An undercover cop is given an obscure word to drop in conversation if things go badly, which aborts the mission. However," +
    					"the conversation with the mob he's infiltrating makes it very hard to avoid saying it.";
			 	break;
    case 21: sentence = "Write a möbius strip structured story that repeats after two complete loops round the text, instead of one. As in, " +
    					"it takes two complete reads of the text to read the whole story.";
    			break;
    case 22: sentence = " Write a story that gives the order of events backwards, but still holds shock value at the end.";
			 	break;
    case 23: sentence = "You have an imaginary friend. Or are you their imaginary friend? Neither of you know anymore...";
			 	break;
    case 24: sentence = "Give this story a happy ending - A man took of his wedding band and placed it on the bar top, looked at it for a while, then left.";
			 	break;
    case 25: sentence = "The New World wasn't discovered until it's seen from a rocket in the space age.";
			    break;
    case 26: sentence = "Life periodically receives 'patches' from it's creators. These are some of the complaints/bug reports posted by its users.";
			 	break;
    case 27: sentence = "What are funny patch notes I should include in the next update?";
			 	break;
    case 28: sentence = "Earth, all its inhabitants and its entire history are merely the science project of an alien 9th grader. The project is due today.";
				break;
    case 29: sentence = "The moment when all the members of the most notorious and ruthless gang in the U.S. figure out that every single one of them is an undercover cop from different counties.";
			 	break;
    case 30: sentence = "The hero beats the villain by stooping even lower.";
			 	break;
    case 31: sentence = "A Scientist from 1964 time travels to present day. Not knowing that the area around his lab becomes a chinatown after 50 years, he mistakenly believes that the U.S. was invaded by china and reports his findings.";
			 	break;
    case 32: sentence = " Tell me about the american version of Hogwarts School of Witchcraft and Wizardry.";
			 	break;
    case 33: sentence = "Write about something ugly — war, fear, hate, or cruelty–but find the beauty (silver lining) in it.";
			 	break;
    case 34: sentence = "He turned the key in the lock and opened the door. To his horror, he saw…";
			 	break;
    case 35: sentence = "There is a magic talisman that allows its keeper to read minds. It falls into the hands of a young politician…";
			 	break;
    case 36: sentence = "Write a poem in the style of Dr. Seuss";
			 	break;
    case 37: sentence = "A babysitter is snooping around her employer's house and finds a disturbing photograph...";
			 	break;
    case 38: sentence = "Your character suspects her husband is having an affair and decides to spy on him. What she discovers is not what she was expecting...";
			 	break;
    case 39: sentence = "Your character goes out for dinner on a date and becomes attracted to the waiter or waitress....";
			 	break;
    case 40: sentence = "Your character can hear the voices of the dead on a certain radio channel. She decides to take advantage of this channel to find answers to some questions that are bothering her...";
			 	break;
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
