package Wk1Lab6Dice;

import java.util.Scanner;

public class Wk1Lab6Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open scanner to receive user input
		//draft sysout statement asking for user input for # of die sides
		// create method that houses for loop to generate random numbers
		//	use 2 Math.randoms to receivie a random # 1- user input for each die
		//			*dont forget to cast*
		//			*also don't forget to multiply the entire method by user input to
		//			*get the the number options matching the amount of faces user indicates
		//write sysout staement to display what the user "rolled"
		//ask if they want to roll again w/sysout
		
		//Opens a new scanner
		Scanner scan = new Scanner(System.in);
		
		String userName;
		int dieFace;
		String userCont = "y";
		
		
		System.out.println("Hello! Welcome to Grand Circus' Digital Casino! Please enter your name: ");
		userName = scan.nextLine();
		
		//this is the opening of the while loop that will allow the program to 
		//run again if user chooses yes. Write all code you want repeated within its braces
		while (userCont.equalsIgnoreCase("y")) {

			// This will prompt user for input and guide them if not an integer 1-10
			System.out.println(userName + ", " + "please enter the number of sides your ideal set of dice would have: ");
			
					// This checks if input is a number
					while (!scan.hasNextInt()) {
						System.out.println("Please enter a NUMERIC value");
						scan.nextLine();
					}
					dieFace = scan.nextInt();
					
			//This begins the game with the user		
			System.out.println("Great! You want to use two " + dieFace + "-sided dice!");
			System.out.println("Let's roll! Please press any number key to roll your " + dieFace + "-sided dice. Good luck!");
			
			// This checks if input is a number
			while (!scan.hasNextInt()) {
				System.out.println("Please enter a NUMERIC value");
				scan.nextLine();
			}
			scan.nextInt();
			
			//This tells user what he/she rolled
			System.out.println("You rolled a " + rollDice(dieFace) + " and a " + rollDice(dieFace) + "!");
			
			
			// Asking use would he/she like to enter another number
			System.out.println("Would you like to continue playing? Enter Y for yes. Otherwise, press any other key.");		
			userCont = scan.next();
		}
		
		System.out.println("Thank you for visiting Grand Circus Digital Casino! If you've won anything, you've got code...NOT coins,"); 		
		System.out.println("so don't forget to cash out your winnings for a suprise scholarship to one of our boot camps. Goodbye.");
		
		scan.close();
	}
//WRITE YOUR METHODS HERE
		//This is the method containing the for loop that 
		//will simulate the random nature of rolling dice
		
		public static int rollDice(int diceFaces) {
			int dice1 = (int) (Math.random() * diceFaces);
			return dice1;
		
		}


	
}
