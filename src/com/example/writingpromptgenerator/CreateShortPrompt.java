package com.example.writingpromptgenerator;

import java.util.Random;

public class CreateShortPrompt {
	
	public static String CreateSentence( ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(16) + 1;
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
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
