package com.example.writingpromptgenerator;

import java.util.Random;

public class CreatePrompt {
	
	public static String CreateSentence(String setting, String subject, String conflict ){
	String sentence;
	Random generator = new Random(); 
	int choice = generator.nextInt(10) + 1;
	switch (choice) {
    case 1:  sentence =  subject + " " + conflict + " in " + setting + ".";
             break;
    case 2:  sentence = "In " + setting + ", " + subject + " " + conflict + ".";
             break;
    case 3:  sentence = "In the dead of winter, a " + conflict + " happens in front of " + subject + " in " + setting + ".";
             break;
    case 4:  sentence =  subject + " is forced to act when " + conflict + " in " + setting;
             break;
    case 5:  sentence = "A " + conflict + " happens in " + setting + ", while " + subject + " watches from afar.";
             break;
    case 6:  sentence =  subject + " can not stop " + conflict + " because he is stuck at " + setting +"." ;
             break;
    case 7:  sentence = "A succesful attempt to " + conflict +" in " + setting + ", brings a group of " + subject +"s together.";
             break;
    case 8:  sentence =  subject + " on his day off is enjoying his time in " + setting + " when a threatening figure attempts to " + conflict + " ." ; //Double Subject?
             break;
    case 9:  sentence = "The peaceful " + setting + " is actually planning to " + conflict + ". Only " + subject + " can stop them.";
             break;
    case 10: sentence = "Your coworker Bob is " + subject + ", he asks you to help " + conflict + " in " + setting + ".";
             break;
    default: sentence = "Error Invalid random number. Please try again";
    		 break;
}
	return sentence;
	
	 }
}
