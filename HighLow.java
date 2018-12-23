import java.util.Scanner;

public class HighLow {
	// Imported Scanner and changed name to upper case
	// Copied everything from my GuessingGame.java so I could edit it and create the
	// HighLow.java
	public static void main(String args[]) {
		boolean edd = true;
		//Added edd to let us know how many times we want to play
		while (edd == true) {
			System.out.println("Guess the number!");

			//Moved "Guess the number!" to the front so you can see it

			hiLo();


			System.out.println("\n Want to play again? \n type yes or no");
			//changed the message to type yes or no out of boredom and grasping at straws
			//It appears that however I was able to let the program look over the user's number is not so
			//easily replicated for the user inserting a character
			Scanner userChar = userNum();
			String userChar1 = userChar.next();
			//Ah, my problem was that I was trying to use the .next() operation with a character, when it only
			//accepts number type data and strings.
			
			System.out.println(userChar);
			
			if (userChar1 == "no") { //changed "n" to "no" due to the same reason as when I changed the above message
				//There was a problem when I said "n" because the whole thing just looped again when I typed n
				System.out.println("Huh, this is odd");
				edd = false;
			}
			//adding a way for the user to say yes or no was very difficult, but so worth it
		}
		System.out.println("Thanks for playing!");
	}

	static void hiLo() {
		//Made a static void so I could give messages and communicate with the program
		//randNum1 was created so that the compiler understands how to use it.
		int randNum1 = randGen(-10, 10); //edited to reflect the range
		//I'm trying something new and calling methods within the class by adding the modifier static to thein name

		int count = 0;
		//This counter should solve any problems of infinite loops

		int attempts = 1;
		//Now with an attempt counter!

		do{

			//userAns.nextInt();
			//This function call should solve my infinite loop...
			//Yay it does!
			//cleared out the above userAns.nextInt(); since I moved the scanner code to down below

			Scanner userAns = userNum();
			//In order to use a variable as a scanner, I need to have Scanner in front to tell the data type
			int userAns1 = userAns.nextInt();
			/*The counter does not solve any infinite loop problems, user cant enter anymore answers. I'm going to move
		to move the userAns into the do loop so that the user can enter new answers at the start of each loop*/

			if (userAns1 == randNum1) {
				count = count + 1;
				/*Deleted break; because it shouldn't matter when the if conditions are met, the else will be
				skipped anyway when this code runs*/
			} else {
				attempts++;
				System.out.println("Sorry, that isn't right");
				//once I get this working, I'll create a new if-else statement, or a switch block to give user hints
				if (userAns1 > randNum1) {
					System.out.println("Think smaller and...");
				} else if (userAns1 < randNum1) {
					System.out.println("Think bigger and...");
				}
				//added a system for checking if the user got the right number, but it keeps saying that the
				//number is bigger. Hmm...
				System.out.println("Try again!");
				//Changed "Guess the number!" to "Try again!" as it makes sense as you go through the loop
				//Moved down to avoid the program from saying Guess the number! Try again! right at the start

				//The following code is for testing purposes
				//--------------------------
				//System.out.println(randNum1);
				//--------------------------
			}
			/*It appears that I've created an infinite loop. When I set it so that I'd collect user input, I only
			 * collect the first input. When I added the testing code to show what the random number is, even when
			 * I entered the correct number, it kept telling me to think smaller. I theorize that this is due to
			 * the Scanner being from outside of the loop.*/
			//I was right, as soon as I moved the Scanner into the loop, it could read what the user input next.
			//When the program could read what the user input next, it compared the new answers to the hidden
			//number and gave the appropriate response.

		} while (count < 1);
		/*The loop is infinite because there is no pause for inputting new answers, so the program goes through
		 * the same checks every time with the same conditions. The counter has yet to be triggered so I have yet
		 * to test it (even though all logic I hold states it works)*/
		//Waddya know, it works just fine
		System.out.println("That's right! The answer is " + randNum1);
		System.out.println("You figured it out after " + attempts + " tries!");
	}

	// I put the functions that the main calls after the main
	static Scanner userNum() {
		
		Scanner userInput = new Scanner(System.in);
		
		return userInput;
		// used as a return statement. This function appears to work because I can have
		// user input once.
	}
	
	/*Make a new Scanner method*/

	static int randGen(int min, int max) {
		// double num = Math.random();

		// I feel so proud of making the random number between 1 and 100!
		// added 1 to num's answer to avoid numbers range to be between 0 and 99
		// num = num*1000 - 100;
		// int randNum = (int) num;
		// Needs to have num type casted into a new variable for the compiler to
		// understand.

		// To make a range between -100 and 1000 I looked to the Internet.
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
}
