package com.example.writingpromptgenerator;

import java.util.Random;

public class GetRandomSubject {

	static String heroCompare = "Hero";
	static String[] hero = {"Soilder","Firefighter"};
	
	public static String RandomSubject(String subjectTopic){
		 String subject = " ";
		 	if(subjectTopic.equals(heroCompare)){
		 	 subject = (hero[new Random().nextInt(hero.length)]);
		 		return subject;
		 	}
		return null;	
	 }
}
