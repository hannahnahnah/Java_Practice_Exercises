import java.util.Scanner;

public class exercise18 {
	//Prompt the user to enter a number.
	//Use a for-loop to calculate the sum of all the numbers 
	//from 1 to the number entered.

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNumber = 0;
		int sum = 0;
		String userContinue = null;
		
		
		do {
			System.out.println("Enter a number: ");
			userNumber = scnr.nextInt();
			scnr.nextLine();
			
			for (int i = 0; i <= userNumber; ++i) {
				sum =+ sum + i;
			}
			System.out.println(sum);
			
			System.out.println("Would you like to continue? (y/n)");
			userContinue = scnr.nextLine();
			
		} while (userContinue.substring(0, 1).equalsIgnoreCase("y"));
		
		System.out.println("The End.");
	}

}
