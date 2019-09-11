import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise15 {
	//Prompt the user for a number.
	//USe a for loop to calculate the cubes of 
	//all the numbers from one to that number

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double userNumber;
		String userContinue = null;
		
		do {
		
		System.out.println("Enter a number: ");
		userNumber = scnr.nextInt();
		scnr.nextLine();
		
		for (double i = 1; i <= userNumber; ++i) {
			System.out.print(((int)Math.pow(i, 3)) + " ");
		}
		
			//do {	
				//try { //this try catch isn't actually working....
					System.out.println("\nWould you like to continue? (y/n): ");
					userContinue = scnr.nextLine();
					//userContinue.matches("[A-Z]*[a-z]*");
			//	} catch (InputMismatchException ex) {
				//	System.out.println("That was a number. Please enter (y/n).");
			//	}
		//	} while (!(userContinue.substring(0, 1).equalsIgnoreCase("y")));

		} while (userContinue.substring(0, 1).equalsIgnoreCase("y"));
		
		System.out.println("The End.");
	}

}
