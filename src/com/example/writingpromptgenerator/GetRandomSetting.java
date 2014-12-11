package com.example.writingpromptgenerator;

import java.util.Random;


public class GetRandomSetting {
	
	static String fiftyStatesCompare = "The Fifty States";
	static String[] theFiftyStates = {"Alabama", "Alaska", "Arizona","Arkansas","California",
		"Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii","Idaho",
		"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
		"Maryland","Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
		"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey","New Mexico",
		"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon","Pennsylvania",
		"Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah",
		"Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
	
	static String americaCompare = "America";
	static String[]america ={"small town in the middle of nowhere", "Yellowstone", "New York", 
		"Hollywood", "Chicago", "Houston", "Los Angeles", "Philadelphia", "Phoenix", "San Antonio", 
		"San Diego", "Dallas", "San Jose", "Austin", "Indianapolis", "San Francisco", "Columbus",
		"Fort Worth", "Charlotte", "Detroit", "El Paso", "Memphis", "Boston", "Seattle","Denver",
		"Washington DC", "Nashville", "Baltimore", "Portland", "Oklahoma City", "Milwaukee", "Las Vegas",
		"Albuquerque", "Tucson", "Fresno", "Sacramento", "Kansas City", "Atlanta", "Omaha", "Miami",
		"Oakland", "Tulsa", "Cleveland", "The Capitol Building", "Golden Gate Bridge", "Lincoln Memorial",
		"Mount Rushmore", "Statue of Liberty", "The Whitehouse", "Grand Canyon", "Niagara Falls",
		"Crater Lake", "Yellowstone National Park", "Hoover Dam",};
		
	static String horrorLocationsCompare = "Horror Settings";
	static String[]horrorLocations = {"Camp Crystal Lake", "Elm Street", "a cabin in the woods",
		"an old abandoned manor", "a haunted house", "a graveyard", "some crypts", " the sewer", 
		"a series of underground tombs", "a ghost town"};
	
	static String bigCityLocationsCompare = "Big City Locations";
	static String[]bigCityLocations ={"the town square", "the hot nightclub", " a tourist trap", "a theme park",
		"the tallest building in the city"};
		
	static String generalSettingsCompare = "General Settings";
	static String[]generalSettings = {"a forrest", "a village", "a town", "a castle", "a city", "a lake", 
		"the ocean", "the desert", "space", "the tundra", "a pond", "a stream", " the wetlands", "the Coral Reefs",
		"an island", "the savanna", "the plains", "the artic", "a mountain"};
	
	static String europeCompare = "Europe";
	static String[]europe = {"Albania","Andorra","Austria","Belarus","Belgium",
		"Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic",
		"Denmark","East Germany","Estonia","Faroe Islands","Finland","France","Germany",
		"Gibraltar","Greece","Guernsey","Hungary","Iceland","Ireland","Isle of Man","Italy",
		"Jersey","Latvia","Liechtenstein","Lithuania","Luxembourg","Macedonia","Malta","Moldova",
		"Monaco","Montenegro","Netherlands","Norway","Poland","Portugal","Romania","Russia",
		"San Marino","Serbia","Serbia and Montenegro","Slovakia","Slovenia","Spain",
		"Svalbard and Jan Mayen","Sweden","Switzerland","Ukraine","Soviet  Republic",
	    "United Kingdom","Vatican City","Åland Islands", "Eiffel Tower", "The Colosseum",
	    "Big Ben", " Saint Basil’s Cathedral", "Leaning Tower of Pisa","Tower Bridge",
	    " Arc de Triumph", "Trevi Fountain", "Rome", "Paris", "Barcelona", "Berlin", "Budapest",
	    "Florence", "London", "Amsterdam", "Prauge", "Madrid", "Istanbul", "Venice", "Dublin"};
	static String asiaCompare = "Asia";
	static String[]asia ={"Afghanistan","Armenia","Azerbaijan","Bahrain","Bangladesh",
		"Bhutan","Brunei","Cambodia","China","Cyprus","Georgia","Hong Kong","India",
		"Indonesia","Iran","Iraq","Israel","Japan","Jordan","Kazakhstan","Kuwait",
	    "Kyrgyzstan","Laos","Lebanon","Malaysia","Maldives","Mongolia","Myanmar (Burma)",
		"Nepal","Neutral Zone","North Korea","Oman","Pakistan","Isreal",
		"People's Democratic Republic of Yemen","Philippines","Qatar","Saudi Arabia",
		"Singapore","South Korea","Sri Lanka","Syria","Taiwan","Tajikistan","Thailand",
		"Timor-Leste","Turkey","Turkmenistan","United Arab Emirates","Uzbekistan",
		"Vietnam","Yemen", "The Killing Fields", "The Forbidden City", "Great Wall of China", 
		"Angkor Wat", "Taj Mahal","Singapore", "Hong Kong", "Bangkok", "Beijing", "Tokyo",
		"Seoul", "Shanghai", "Taipei", "New Delhi", "Kyoto", "Bombay", "Hanoi"};
	
	static String africaCompare = "Africa";
	static String[]africa ={"Algeria","Angola", "Benin","Botswana","Burkina Faso","Burundi",
		"Cameroon","Cape Verde","Central African Republic","Chad","Comoros","Congo","Côte d’Ivoire",
		"Djibouti","Egypt","Equatorial Guinea","Eritrea","Ethiopia","Gabon","Gambia","Ghana",
		"Guinea","Kenya","Lesotho","Liberia","Libya","Madagascar","Malawi","Mali","Mauritania",
		"Mauritius","Mayotte","Morocco","Mozambique","Namibia","Niger","Nigeria","Rwanda",
	    "Réunion","Saint Helena","Senegal","Seychelles","Sierra Leone","Somalia","South Africa",
		"Sudan","Swaziland","São Tomé and Príncipe","Tanzania","Togo","Tunisia","Uganda",
		"Western Sahara","Zambia","Zimbabwe"};

	static String antarticaCompare = "Antartica";
	static String[]antartica = {"Antartica", "South Pole", "Deception Island", "Ice Caps",
			"Paradise Harbor", "Observation Hill", "McMundo Station", "iceberg"};
    
	static String australiaCompare = "Australia";
	static String[]australia ={"Sydney", "The Great Barrier Reef", "Melbourne", "Sydney Opera House", 
		" Heart Reef", "Melbourne Cricket Ground", "New Zealand"};
	
	static String NorthAmericaCompare = "North America";
	static String[]NorthAmerica = {"Canada", "North America", "Mexico"};
	
	static String comicBookLocationsCompare = "Comic Book Locations";
	static String[]comicBookLocations = {"Gotham", "Metropolis", "Argo City", "Astro City", "Central City",
		"Hub City", "Kanador", "Mega-City One", "Midwar City", "Smallville"};

	public static String RandomSetting(String settingTopic){
		 String setting = " ";
		 	if(settingTopic.equals(fiftyStatesCompare)){
		 	 setting = (theFiftyStates[new Random().nextInt(theFiftyStates.length)]);
		 		return setting;
		 	}
		 	else if(settingTopic.equals(americaCompare)){
			 	 setting = (america[new Random().nextInt(america.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(bigCityLocationsCompare)){
			 	 setting = (bigCityLocations[new Random().nextInt(bigCityLocations.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(generalSettingsCompare)){
			 	 setting = (generalSettings[new Random().nextInt(generalSettings.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(europeCompare)){
			 	 setting = (europe[new Random().nextInt(europe.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(asiaCompare)){
			 	 setting = (asia[new Random().nextInt(asia.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(africaCompare)){
			 	 setting = (africa[new Random().nextInt(africa.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(antarticaCompare)){
			 	 setting = (antartica[new Random().nextInt(antartica.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(australiaCompare)){
			 	 setting = (australia[new Random().nextInt(australia.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(NorthAmericaCompare)){
			 	 setting = (NorthAmerica[new Random().nextInt(NorthAmerica.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(comicBookLocationsCompare)){
			 	 setting = (comicBookLocations[new Random().nextInt(comicBookLocations.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(horrorLocationsCompare)){
			 	 setting = (horrorLocations[new Random().nextInt(horrorLocations.length)]);
			 		return setting;
			 	}
		 	else{
		 		return null;	
		 	}
	 }
}
