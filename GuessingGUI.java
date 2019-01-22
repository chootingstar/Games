import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
//imported a lot of swings and awts for the GUI to work

//copied everything from HighLow.java to edit into a GUI

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;



public class GuessingGUI extends JFrame {
	private JTextField textField;
	private JLabel lblSorry;
	public static int attempts = 1;
	static int randNum1;
	//Now with an attempt counter!

	public GuessingGUI() {
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Apparently I need this to be in the constructor for it
		//to work
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblWelcome = new JLabel("Guess a number between -100 and 1000");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblWelcome);

		//	txtEnterHere = new JTextField();


		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(8);

		JButton btnGuessTheNumber = new JButton("Guess!");
		btnGuessTheNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hiLo();
			}
		});
		getContentPane().add(btnGuessTheNumber);
		
		

		lblSorry = new JLabel("Get rid of this");
		getContentPane().add(lblSorry);
	}
	// Set lblSorry as its own variable, linking it to JLabel here so I can change it in hiLo()




	public void hiLo() {
		
		String guessText = textField.getText(); //While I need this to help transition into guess, do I really? Must be a String type.
		String message = ""; 
		/*The counter does not solve any infinite loop problems, user cant enter anymore answers. I'm going to move
			to move the userAns into the do loop so that the user can enter new answers at the start of each loop*/
		
		int guess = Integer.parseInt(guessText); //converted String type to int type

		if (guess == randNum1) {
			message = "Winner";
			lblSorry.setText(message + " it took you " + attempts); //sets the String in lblSorry. Need to use '.' modifier I think because I'm making changes to an object
			
		} else {
			attempts++;

			
			if (guess > randNum1) {
				message = "Sorry, that's too high. Think Smaller";
				lblSorry.setText(message);

			} else {
				message = "Sorry, that's too low. Think Bigger";
				lblSorry.setText(message);
				
			}
			//added a system for checking if the user got the right number, but it keeps saying that the
			//number is bigger. Hmm...

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



	}

	// I put the functions that the main calls after the main

	static int randGen(int min, int max) {
	//Made randNum1 directly changed inside of the randGen thanks to Obdulia. Now I only need to call randGen in main
		randNum1 = (int) (Math.random() * ((max - min) + 1)) + min; //edited to reflect the range
		// To make a range between -100 and 1000 I looked to the Internet.
		return randNum1;
	}

	public static void main(String args[]) {
		//Made a static void so I could give messages and communicate with the program
		//randNum1 was created so that the compiler understands how to use it.
		randGen(-100, 1000);
		//I'm trying something new and calling methods within the class by adding the modifier static to thein name

		GuessingGUI gg = new GuessingGUI();
		gg.setSize(new Dimension(300, 300));
		gg.setVisible(true);

	}
}