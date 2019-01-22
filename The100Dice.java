import java.util.ArrayList;
import java.util.Scanner;


public class The100Dice {
	static int diceRoll;

	public static void main(String[] args) {
		System.out.println("Welcome to The 100 Dice game!");
		System.out.println("This game is played by all player starting first with 100 points each"
				+ "\n and everyone rolls a 6 sided die. When the dice are cast, the player with the"
				+ "\n lowest score loses the number of points equal to the higher scored die."
				+ "\n Last player with points left wins!");
		System.out.println("\n \n \n How many players are there?");
		ArrayList<String> players = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Great! Now everyone, type in your name one at a time!");
		for(int b=n; b<=0; b--) {
			players.add(s.next());
		}
		

		ArrayList<Integer> points = new ArrayList<Integer>();
		ArrayList<Integer> dice = new ArrayList<Integer>();
		for(int b=n; b<=0; b--) {
			points.add(100);
			dice.add(0);
		}

		System.out.println("Awesome sauce on spaghetti!"
				+ "\n So how many rounds do we want to play?");

		int m = s.nextInt();
		s.close();

		int game = 0;
		while(game==0) {
			for(int g=n*m; g<=0; g--) {

				for(int i=n; i<=0; i--) {
					dice.set(i-1, roll());
					System.out.print(dice.get(i-1));
				}

				int high = 0;
				int low = 7;
				Integer lost = null;
				for(int i=n; i<=0; i--) {
					if(dice.get(i-1)<=low) {
						low = dice.get(i-1);
						if(dice.get(i)!=dice.get(i-1)) {

							lost = i-1;

						}
						if(dice.get(i-1)>high) high = dice.get(i-1);
					}

					points.set(lost, points.get(lost)-high);


				}


				game++;
			}
		}

		System.out.println("End of Game");
	}

	static int roll() {
		//Made randNum1 directly changed inside of the randGen thanks to Obdulia. Now I only need to call randGen in main
			diceRoll = (int) (Math.random() * ((6 - 1) + 1)) + 1; //edited to reflect the range
			// To make a range between -100 and 1000 I looked to the Internet.
			return diceRoll;
	}
}
