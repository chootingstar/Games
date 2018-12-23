import java.util.Scanner;
public class GuessingGame {

	//Imported Scanner and changed name to upper case
	
	public static void main(String args[]) {
		System.out.println("Guess the number!");
		//Moved "Guess the number!" to the front so you can see it
		
		
		//Made a static void so I could give messages and communicate with the program
		//randNum1 was created so that the compiler understands how to use it.
		int randNum1;
		GuessingGame gg = new GuessingGame();
		//Nick helped with making gg to call randGen into randNum1
		randNum1 = gg.randGen();
		
		int count = 0;
		//This counter should solve any problems of infinite loops
		
		do{
			
			//userAns.nextInt();
			//This function call should solve my infinite loop...
			//Yay it does!
			//cleared out the above userAns.nextInt(); since I moved the scanner code to down below
			
			Scanner userAns = gg.userNum();
		//In order to use a variable as a scanner, I need to have Scanner in front to tell the data type
			int userAns1 = userAns.nextInt();
		/*The counter does not solve any infinite loop problems, user cant enter anymore answers. I'm going to move
		to move the userAns into the do loop so that the user can enter new answers at the start of each loop*/
			
			if (userAns1 == randNum1) {
				count = count + 1;
				/*Deleted break; because it shouldn't matter when the if conditions are met, the else will be
				skipped anyway when this code runs*/
			} else {
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
	}
	
	
	//I put the functions that the main calls after the main
	Scanner userNum() {
		Scanner userInput= new Scanner(System.in);
		return userInput;
		//used as a return statement. This function appears to work because I can have user input once.
	}
	
	
	int randGen() {
		double num = Math.random();
		
		//I feel so proud of making the random number between 1 and 100!
		//added 1 to num's answer to avoid numbers range to be between 0 and 99
		num = num*100 + 1;
		int randNum = (int) num;
		//Needs to have num type casted into a new variable for the compiler to understand.
		
		return randNum;
	}
	
}
