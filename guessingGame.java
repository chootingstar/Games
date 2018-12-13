import java.util.Scanner;
public class guessingGame {

	
	
	public static void main(String args[]) {
		
		int randNum1;
		guessingGame gg = new guessingGame();
		randNum1 = gg.randGen();
		Scanner userAns = gg.userNum();
		int userAns1 = userAns.nextInt();
		do{
			System.out.println("Guess the number!");
			
			if (userAns1 == randNum1) {
				break;
			} else {
				System.out.println("Sorry, that isn't right");
			}
			
		} while (userAns1 != randNum1);
			System.out.println("That's right! The answer is " + randNum1);
	}
	Scanner userNum() {
		Scanner userInput= new Scanner(System.in);
		return userInput;
	}
	 int randGen() {
		double num = Math.random();
		
		num = num*100;
		int randNum = (int) num;
		
		return randNum;
	}
	
}
