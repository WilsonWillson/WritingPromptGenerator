package com.example.writingpromptgenerator;

import java.util.Random;

public class CreatePrompt {
	
	public static String CreateSentence(String setting, String subject, String conflict ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(11) + 1;
	switch (choice) {
    case 1:  sentence = "A "+ subject + " " + conflict + " in " + setting + ".";
             break;
    case 2:  sentence = "In " + setting + ", a " + subject + " " + conflict + ".";
             break;
    case 3:  sentence = "A " + conflict + " for a " + subject + " happens at " + setting + ".";
             break;
    case 4:  sentence = "A " + conflict + " in " + setting + " forces " + subject + " to act.";
             break;
    case 5:  sentence = "A " + conflict + " in " + setting + " happens while a " + subject + " watches from afar.";
             break;
    case 6:  sentence = "A " + subject + " can not stop " + conflict + " because he is stuck at " + setting +"." ;
             break;
    case 7:  sentence = "A " + conflict +" in " + setting + " bring a group of " + subject +"s together.";
             break;
    case 8:  sentence = "A " + subject + " on his day off is enjoying his time at " + setting + " when " + conflict + " happens." ;
             break;
    case 9:  sentence = "The peaceful " + setting + " is actually planning to " + conflict + ". Only " + subject + " can stop them.";
             break;
    case 10: sentence = "Your coworker Bob is a " + subject + ", he asks you to help " + conflict + " at " + setting + ".";
             break;
    case 11: sentence = "It is the " + subject + " apocalypse. Your group has to get to " + setting + " but " + conflict + " stands in your way.";
    		break;
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
