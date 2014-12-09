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
	static String[]america ={" a small town in the middle of nowhere", "Yellowstone", "New York", "Hollywood", "Chicago"};
		
	static String horrorLocationsCompare = "Horror Settings";
	static String[]horrorLocations = {"Camp Crystal Lake", "Elm Street", "a cabin in the woods"};
	
	static String bigCityLocationsCompare = "Big City Locations";
	static String[]bigCityLocations ={};
		
	static String smallTownLocationsCompare = "Small Town Locations";
	static String[]smallTownLocations = {"the General Store", "the main road"};
	
	static String generalSettingsCompare = "General Settings";
	static String[]generalSettings = {"forrest", "village", "town", "castle"};
	
	static String europeCompare = "Europe";
	static String[]europe = {"Albania","Andorra","Austria","Belarus","Belgium",
		"Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic",
		"Denmark","East Germany","Estonia","Faroe Islands","Finland","France","Germany",
		"Gibraltar","Greece","Guernsey","Hungary","Iceland","Ireland","Isle of Man","Italy",
		"Jersey","Latvia","Liechtenstein","Lithuania","Luxembourg","Macedonia","Malta","Moldova",
		"Monaco","Montenegro","Netherlands","Norway","Poland","Portugal","Romania","Russia",
		"San Marino","Serbia","Serbia and Montenegro","Slovakia","Slovenia","Spain",
		"Svalbard and Jan Mayen","Sweden","Switzerland","Ukraine","Soviet  Republic",
	    "United Kingdom","Vatican City","Åland Islands"};
	
	static String asiaCompare = "Asia";
	static String[]asia ={"Afghanistan","Armenia","Azerbaijan","Bahrain","Bangladesh",
		"Bhutan","Brunei","Cambodia","China","Cyprus","Georgia","Hong Kong","India",
		"Indonesia","Iran","Iraq","Israel","Japan","Jordan","Kazakhstan","Kuwait",
	    "Kyrgyzstan","Laos","Lebanon","Malaysia","Maldives","Mongolia","Myanmar (Burma)",
		"Nepal","Neutral Zone","North Korea","Oman","Pakistan","Isreal",
		"People's Democratic Republic of Yemen","Philippines","Qatar","Saudi Arabia",
		"Singapore","South Korea","Sri Lanka","Syria","Taiwan","Tajikistan","Thailand",
		"Timor-Leste","Turkey","Turkmenistan","United Arab Emirates","Uzbekistan",
		"Vietnam","Yemen"};
	
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
	static String[]antartica = {"Antartica", "South Pole", "Deception Island", "South Pole",
			"Paradise Harbor", };
    
	static String australiaCompare = "Australia";
	static String[]australia ={"Sydney"};
	
	static String NorthAmericaCompare = "North America";
	static String[]NorthAmerica = {"Canada", "North America", "Mexico"};
	
	static String comicBookLocationsCompare = "Comic Book Locations";
	static String[]comicBookLocations = {"Gotham", "Metropolis"};

	static String movieSettingsCompare = "Movie Settings";
	static String[]movieSettings = {"Hollywood"};
	
	static String tvShowSettingsCompare = "TV Show Settings";
	static String[]tvShowSettings = {"New York"};

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
		 	else if(settingTopic.equals(smallTownLocationsCompare)){
			 	 setting = (smallTownLocations[new Random().nextInt(smallTownLocations.length)]);
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
		 	else if(settingTopic.equals(movieSettingsCompare)){
			 	 setting = (movieSettings[new Random().nextInt(movieSettings.length)]);
			 		return setting;
			 	}
		 	else if(settingTopic.equals(tvShowSettingsCompare)){
			 	 setting = (tvShowSettings[new Random().nextInt(tvShowSettings.length)]);
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
