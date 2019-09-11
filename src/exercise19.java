import java.util.Scanner;

public class exercise19 {
	//Prompt the user to enter two numbers.
	//Use a for-loop to calculate the sum of all the numbers
	//from the first number entered to the second

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput1 = 0;
		int userInput2 = 0;
		int sum = 0;
		String userContinue = null;
		

		do {
			System.out.println("Enter a number: ");
			userInput1 = scnr.nextInt();
			System.out.println("Enter another number:");
			userInput2 = scnr.nextInt();
			scnr.nextLine();
			
			for (int i = userInput1; i <= userInput2; ++i) {
				sum += i;
			}
			System.out.println("The sum of all the numbers from " + userInput1 + " to " + userInput2 + " is " + sum + ".");
			
			System.out.println("\nWould you like to continue? (y/n)");
			userContinue = scnr.nextLine();
			
		} while (userContinue.substring(0, 1).equalsIgnoreCase("y"));
		
		System.out.println("The End.");
		
	}

}
