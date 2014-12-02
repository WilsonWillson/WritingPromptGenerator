package com.example.writingpromptgenerator;

import java.util.Random;

public class CreatePrompt {
	
	public static String CreateSentence(String setting, String subject, String conflict ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(4) + 1;
	switch (choice) {
    case 1:  sentence = "A "+ subject + conflict + "in " + setting + ".";
             break;
    case 2:  sentence = "In " + setting + ", a " + subject + conflict + ".";
             break;
    case 3:  sentence = "A " + conflict + " for a " + subject + " happens at " + setting + ".";
             break;
    case 4:  sentence = "A " + conflict + " in " + setting + " forces " + subject + " to act.";
             break;
    case 5:  sentence = "A " + conflict + " in " + setting + " happens while a " + subject + " watches from afar.";
             break;
    case 6:  sentence = "June";
             break;
    case 7:  sentence = "July";
             break;
    case 8:  sentence = "August";
             break;
    case 9:  sentence = "September";
             break;
    case 10: sentence = "October";
             break;
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
