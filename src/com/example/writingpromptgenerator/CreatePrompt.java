package com.example.writingpromptgenerator;

import java.util.Random;

public class CreatePrompt {
	
	public static String CreateSentence(String setting, String subject, String conflict ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(10) + 1;
	switch (choice) {
    case 1:  sentence = "A "+ subject + " " + conflict + " in " + setting + ".";
             break;
    case 2:  sentence = "In " + setting + ", a " + subject + " " + conflict + ".";
             break;
    case 3:  sentence = "In the dead of winter, a " + conflict + " happens in front of a " + subject + " in " + setting + ".";
             break;
    case 4:  sentence = "A " + subject + " is forced to act when " + conflict + " in " + setting;
             break;
    case 5:  sentence = "A " + conflict + " happens at " + setting + ", while a " + subject + " watches from afar.";
             break;
    case 6:  sentence = "A " + subject + " can not stop " + conflict + " because he is stuck at " + setting +"." ;
             break;
    case 7:  sentence = "A succesful attempt to " + conflict +" in " + setting + ", brings a group of " + subject +"s together.";
             break;
    case 8:  sentence = "A " + subject + " on his day off is enjoying his time in " + setting + " when a threatening figure attempts to " + conflict + " ." ; //Double Subject?
             break;
    case 9:  sentence = "The peaceful " + setting + " is actually planning to " + conflict + ". Only a " + subject + " can stop them.";
             break;
    case 10: sentence = "Your coworker Bob is a " + subject + ", he asks you to help " + conflict + " in " + setting + ".";
             break;
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
