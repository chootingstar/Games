import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
//imported a lot of swings and awts for the GUI to work

//copied everything from HighLow.java to edit into a GUI

import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLayeredPane;



public class GuessingGUI extends JFrame {
	private JTextField textField;
	public static int attempts = 1;
			//Now with an attempt counter!
	
	public GuessingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Apparently I need this to be in the constructor for it
		//to work
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblWelcome = new JLabel("Guess a number between -100 and 1000");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblWelcome);
		
	//	txtEnterHere = new JTextField();
		
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(8);
		
		JButton btnGuessTheNumber = new JButton("Guess the Number!");
		btnGuessTheNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnGuessTheNumber);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane);
		
		JLabel lblSorry = new JLabel("Sorry, that isn't right. That's too high.");
		getContentPane().add(lblSorry);
	}
	// Imported Scanner and changed name to upper case
		// Copied everything from my GuessingGame.java so I could edit it and create the
		// HighLow.java
		
		
		static void call() {
			boolean edd = true;
			//Added edd to let us know how many times we want to play
			while (edd == true) {
				

				//Moved "Guess the number!" to the front so you can see it

				hiLo();



				
				
				if (6>5) {
					
					edd = false;
				}
				//adding a way for the user to say yes or no was very difficult, but so worth it
			}
			System.out.println("Thanks for playing!");
		}
		
		

		static void hiLo() {
			//Made a static void so I could give messages and communicate with the program
			//randNum1 was created so that the compiler understands how to use it.
			int randNum1 = randGen(-100, 1000); //edited to reflect the range
			//I'm trying something new and calling methods within the class by adding the modifier static to thein name

			int count = 0;
			//This counter should solve any problems of infinite loops

			

			do{

				//userAns.nextInt();
				//This function call should solve my infinite loop...
				//Yay it does!
				//cleared out the above userAns.nextInt(); since I moved the scanner code to down below

			
				/*The counter does not solve any infinite loop problems, user cant enter anymore answers. I'm going to move
			to move the userAns into the do loop so that the user can enter new answers at the start of each loop*/

				if (1 == randNum1) {
					count = count + 1;
					/*Deleted break; because it shouldn't matter when the if conditions are met, the else will be
					skipped anyway when this code runs*/
				} else {
					attempts++;
					
					//once I get this working, I'll create a new if-else statement, or a switch block to give user hints
					if (1 > randNum1) {
					
					} else if (1 < randNum1) {
					
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

			} while (count < 1);
			
		}

		// I put the functions that the main calls after the main

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
		
		public static void main(String args[]) {
			GuessingGUI gg = new GuessingGUI();
			gg.setSize(new Dimension(300, 300));
			gg.setVisible(true);
			call();
			
		}
	}