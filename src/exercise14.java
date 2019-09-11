import java.util.Scanner;

public class exercise14 {
	//Prompt the user for a number.
	//Use a for loop to output the squares of 
	//all the numbers from 1 to that number.

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNumber;
		String userContinue = null;
		
		do{
			System.out.println("Enter a number: ");
			userNumber = scnr.nextInt();
			scnr.nextLine();
			
				for (int i = 1; i <= userNumber; ++i) {
				System.out.print(i * i + " ");
				}
			
			System.out.println("\nWould you like to continue? (y/n): ");
			userContinue = scnr.nextLine();
		
		
		} while (userContinue.substring(0, 1).equalsIgnoreCase("y"));
		
		System.out.println("The End.");
	}

}
