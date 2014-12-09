package com.example.writingpromptgenerator;

import java.util.Random;

public class CreateShortPrompt {
	
	public static String CreateSentence( ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(4) + 1;
	switch (choice) {
    case 1:  sentence = "The inner monologue of an idiot turning into a genius within minutes.";
             break;
    case 2:  sentence = "Write a very dark story in the universe of a children's cartoon.";
             break;
    case 3:  sentence = "Make me gag with a vivid description of an everyday object.";
             break;
    case 4:  sentence = "Break my heart in a sentence.";
             break;
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
