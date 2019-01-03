import java.util.Scanner;
public class MadLibber {
	
	public static void main(String args[]) {
		
		/*To start, I'm going to make the main be the nexus of the different mad libs you can do. Then
		 * I'm going to make it to that the user input's the name of the mad lib they want, a switch block
		 * figures out which one the user typed then executes another part of the code. Breaking, and then
		 * telling the user that they are a funny person*/
		System.out.println("Hi! Welcome to MadLibber! The Mad Libs program filled with 2 Mad Lib adventures!");
		System.out.println("To start, type out which of these adventures you want to play:");
		
		
		
		int counter2 = 0;

		while (counter2 < 1) {
			int counter = 0;
			while (counter < 1) {
				//*********************************************************
				//Moved below from above text so that you are prompted each time the adventures to choose from
				System.out.println("\n Magical \n Romance");// removed Space
				//Changed the names of the adventures to compensate input limitations
				System.out.println(" ");
				System.out.println("Type the name of the adventure you want below.");
				//********************************************************
				Scanner adventure = usersWord();
				String a = adventure.next();
				// First time using a switch block right, I've learned quite a bit
				// such as a switch cannot accept Scanner classes
				
				//I had to create a new systemoutprinln to tell me what's going on, apparently a != the case I want
				//System.out.println(a); No longer needed, and it was getting distracting
				//OOohh, so what's happening is that the Scanner only accepts one word and ignores everything after
				//white space
				switch (a) {

//				// cases automatically compare whatever you enter if they match or not
//				case "Space":
//					spaceAdventure();
//					counter++;
//					break; I didn't have enough time to make a third adventure

				case "Magical":
					fantasyWorld();
					counter++;
					break;

				case "Romance":
					preTeenRomance();
					counter++;
					break;

				default:
					System.out.println("Uh, sorry. I'm case sensitive.");
				}
			}
			System.out.println("That's was hilarious! Want to keep the fun rolling?");
			System.out.println("Type yes or no");
			Scanner con = usersWord();
			String c = con.next();
			if (c.equals("no"))//Changed from yes to no (out of lack of foresight)
				counter2++;//Apparently I did not have the foresight that I'd get an endless loop skipping the
			//inner loop so long as I say yes. I'll edit the counter's placement.
			//Fixed
		}
	}
	
//	//Each mad lib function will prompt one by one a type of word
//	//Each word the user types will be displayed as many times as I need
//	static void spaceAdventure() {
//		System.out.println("Behold, the final frontier: Space!");
//		/*multiple prompts for nouns, verbs, adjectives, adverbs, etc.
//		 * Space story with writing like "The rocket was fueled with " + adjective + noun + ", and it
//		 * smelled " + adjective2 + "!"*/
//	}
//	
	static void fantasyWorld() {
		System.out.println("Welcome to a World of Fantasy!");
		/*multiple prompts for nouns, verbs, adjectives, adverbs, etc.
		 * Fantasy story with writing like "Upon the " + adjective + place + " we " + verb + adverb_ly 
		 * + " looking for" + word + "."*/
		Scanner fanWord = usersWord();
		
		System.out.println("What do you call this place?");
		String planetName = fanWord.next();
		System.out.println("What's the name of the kingdom?");
		String kingdomName = fanWord.next();
		System.out.println("Name an emotion.");
		String emotion = fanWord.next();
		System.out.println("Recall a moral alignment.");
		String alignment = fanWord.next();
		System.out.println("What government system does this have?");
		String governmentSystem = fanWord.next();
		System.out.println("Give me a name for your enemies.");
		String opposingForcesName = fanWord.next();
		System.out.println("Take action!");
		String action = fanWord.next();
		System.out.println("Give this person a title worthy of themselves.");
		String title = fanWord.next();
		System.out.println("Recall a special title in plural form.");
		String pluralSpecialTitle = fanWord.next();
		System.out.println("What is the leader morally?");
		String leadersAlignment = fanWord.next();
		System.out.println("What is the leader's first name?");
		String leadersName = fanWord.next();
		System.out.println("Type a preposition.");
		String preposition = fanWord.next();
		System.out.println("Tell me of the terrain one can see here.");
		String terrain = fanWord.next();
		System.out.println("Take another action!");
		String anotherAction = fanWord.next();
		System.out.println("What sort of group is this?");
		String typeOfGroup = fanWord.next();
		System.out.println("What sort of people or creatures are these?!");
		String pluralSortOfPeopleCreatures = fanWord.next();
		System.out.println("Take (yet another) action!");
		String yetAnotherAction = fanWord.next();
		System.out.println("What's a valuable thing or things?");
		String valuableThings = fanWord.next();
		System.out.println("Tell me a special talent that exist.");
		String specialTalent = fanWord.next();
		System.out.println("Give me an adverb.");
		String adverb = fanWord.next();
		System.out.println("How do you say that special talent in past tense?");
		String specialTalentPastTense = fanWord.next();
		System.out.println("How would you like to get from place to place? Tell me in past tense!");
		String aWayToGetFromPlaceToPlacePastTense = fanWord.next();
		System.out.println("Uh... I need a thing, gimmie a thing... please. Or the story won't work and I'll lose my pension!");
		String thing = fanWord.next();
		System.out.println("Take a special action in past tense!");
		String speciaActionPastTense = fanWord.next();
		System.out.println("Take another special action, also in past tense!");
		String specialActionPastTenseNew = fanWord.next();
		System.out.println("Can you give a length of time in one word?");
		String lengthOfTime = fanWord.next();
		System.out.println("Type the/all/[a number]/a or _ to go before your length of time.");
		String important = fanWord.next();
		
		
		System.out.println("In the world of " + planetName + " there is the mighty kingdom of " + kingdomName + ", watching with great " + emotion +".");
		System.out.println("Though times change, and the " + alignment + " " + governmentSystem + " of " + opposingForcesName + " threatened to " + action + " the kingdom of " + kingdomName + ".");
		System.out.println("This troubled the " + title + " of " + kingdomName + ", and summoned " + pluralSpecialTitle + " to aid him against " + opposingForcesName + "'s " + leadersAlignment + " " + leadersName + ".");
		System.out.println("The " + pluralSpecialTitle + " were sent " + preposition + " " + planetName + "'s " + terrain + " in hope that they might " + anotherAction + " " + leadersName + " and their " + typeOfGroup + ".");
		System.out.println("But on their way, the " + pluralSpecialTitle + " encountered " + pluralSortOfPeopleCreatures + " that wanted to " + yetAnotherAction + " the " + pluralSpecialTitle + "' " +  valuableThings + "!");
		System.out.println("What the " + pluralSortOfPeopleCreatures + " didn't expect was that the " + pluralSpecialTitle + " were very good at " + specialTalent + ", and " + adverb);
		System.out.println(specialTalentPastTense + " to overcome the " + pluralSortOfPeopleCreatures + ". With that out of the way, the " + pluralSpecialTitle + " " + aWayToGetFromPlaceToPlacePastTense);
		System.out.println("into the " + governmentSystem + " of " + opposingForcesName + ". Then they " + anotherAction + "ed " + leadersName + " with a " + thing + ". The people of " + planetName + " " + speciaActionPastTense);
		System.out.println("upon the " + anotherAction + " of " + leadersName + " and the " + pluralSpecialTitle + " were " + specialActionPastTenseNew + " for the rest of " + important + " " + lengthOfTime + ".");
	}
	
	static void preTeenRomance() {
		System.out.println("This is a Pre-teen romance novlette!");
		/*multiple prompts for nouns, verbs, adjectives, adverbs, etc.
		 * Preteen romance story as accurate to winning awards and thirsty women in their 30s is like
		 * girlName + girlLastName + " is in love with " + guyName + guyLastName + ", but they couldn't be
		 * together because " + guyName + " is " + preposition + ofOrA + reasonInOneWord + "!?"*/
		Scanner rWord = usersWord();
		
		System.out.println("So charmer, what's the girl's first name?");
		String girlName = rWord.next();
		System.out.println("Nice! How about that last name?");
		String girlLastName = rWord.next();
		System.out.println("What's the lucky guy's name?");
		String guyName = rWord.next();
		System.out.println("What's his last name?");
		String guyLastName = rWord.next();
		System.out.println("Cool, cool. Now tell me your favorite mythical creature.");
		String mythologicalCreature = rWord.next();
		System.out.println("Type and action word in plural form.");
		String pluralAction = rWord.next();
		System.out.println("How do you say there are multiples of that mythical creature?");
		String mythologicalCreaturePlural = rWord.next();
		System.out.println("Oh yeah, know a great place for a date that I can say in one word?");
		String locationForDating = rWord.next();
		System.out.println("Past tense action word here.");
		String action = rWord.next();
		System.out.println("Past tense verb here.");
		String pastTenseVerb = rWord.next();
		System.out.println("What's a good name for a secret organization?");
		String groupGuyIsIn = rWord.next();
		
		System.out.println(girlName + " " + girlLastName + " is in love with " + guyName + " " + guyLastName + ", but they couldn't be");
		System.out.println("together because " + girlName + " is a " + mythologicalCreature + ", and " + guyName + " " + pluralAction);
		System.out.println(mythologicalCreaturePlural + ". However, " + girlName + " ignores it and goes out with him to the ");
		System.out.println(locationForDating + " for their first date. " + guyName + " finds out about " + girlName + " being a ");
		System.out.println(mythologicalCreature + " because she " + action + " in front of him. " + guyName + " didn't care");
		System.out.println("that " + girlName + " is a " + mythologicalCreature + " because she " + pastTenseVerb + " and he");
		System.out.println("really likes that. Now, they need to fight against the " + mythologicalCreaturePlural + " and the ");
		System.out.println(groupGuyIsIn + " to stay with each other forever.");
	}
	
	static Scanner usersWord() {
	//Taken from another program of mine, I just changed the name.	
		Scanner userInput = new Scanner(System.in);
		
		return userInput;
		// used as a return statement. This function appears to work because I can have
		// user input once.
	}
}
