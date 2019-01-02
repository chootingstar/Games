import java.util.Scanner;
public class MadLibber {
	
	public static void main(String args[]) {
		
		/*To start, I'm going to make the main be the nexus of the different mad libs you can do. Then
		 * I'm going to make it to that the user input's the name of the mad lib they want, a switch block
		 * figures out which one the user typed then executes another part of the code. Breaking, and then
		 * telling the user that they are a funny person*/
		System.out.println("Hi! Welcome to MadLibber! The Mad Libs program filled with 3 Mad Lib adventures!");
		System.out.println("To start, type out which of these adventures you want to play:");
		System.out.println("\n Space \n Magical \n Romance");
		//Changed the names of the adventures to compensate input limitations
		System.out.println(" ");
		System.out.println("Type the name of the adventure you want below.");
		
		int counter = 0;
		int counter2 = 0;

		while (counter2 < 1) {
			while (counter < 1) {
				Scanner adventure = usersWord();
				String a = adventure.next();
				// First time using a switch block right, I've learned quite a bit
				// such as a switch cannot accept Scanner classes
				
				//I had to create a new systemoutprinln to tell me what's going on, apparently a != the case I want
				System.out.println(a);
				//OOohh, so what's happening is that the Scanner only accepts one word and ignores everything after
				//white space
				switch (a) {

				// cases automatically compare whatever you enter if they match or not
				case "Space":
					spaceAdventure();
					counter++;
					break;

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
			if (c.equals("yes"))
				counter2++;
		}
	}
	
	//Each mad lib function will prompt one by one a type of word
	//Each word the user types will be displayed as many times as I need
	static void spaceAdventure() {
		System.out.println("Place holder");
		/*multiple prompts for nouns, verbs, adjectives, adverbs, etc.
		 * Space story with writing like "The rocket was fueled with " + adjective + noun + ", and it
		 * smelled " + adjective2 + "!"*/
	}
	
	static void fantasyWorld() {
		System.out.println("Place holder");
		/*multiple prompts for nouns, verbs, adjectives, adverbs, etc.
		 * Fantasy story with writing like "Upon the " + adjective + place + " we " + verb + adverb_ly 
		 * + " looking for" + word + "."*/
	}
	
	static void preTeenRomance() {
		System.out.println("Place holder");
		/*multiple prompts for nouns, verbs, adjectives, adverbs, etc.
		 * Preteen romance story as accurate to winning awards and thirsty women in their 30s is like
		 * girlName + girlLastName + " is in love with " + guyName + guyLastName + ", but they couldn't be
		 * together because " + guyName + " is " + preposition + ofOrA + reasonInOneWord + "!?"*/
		
		
		/* girlName + girlLastName + " is in love with " + guyName + guyLastName + ", but they couldn't be
		 * together because " + girlName + " is a " + mythologicalCreature + ", and " + guyName + pluralAction
		 * + mythologicalCreaturePlural + ". However, " + girlName + " ignores it and goes out with him to "
		 * + locationForDating " for their first date. " + guyName " finds out about " + girlName + " being a "
		 * + mythologicalCreature " because she " + action + " in front of him. " + guyName + " didn't care
		 * that " + girlName + " is a " + mythologicalCreature + " because she " + pastTenseVerb + " and he
		 * really likes that. Now, they need to fight against the " + mythologicalCreaturePlural + " and the "
		 * + groupGuyIsIn " to stay with each other forever."*/
	}
	
	static Scanner usersWord() {
	//Taken from another program of mine, I just changed the name.	
		Scanner userInput = new Scanner(System.in);
		
		return userInput;
		// used as a return statement. This function appears to work because I can have
		// user input once.
	}
}
