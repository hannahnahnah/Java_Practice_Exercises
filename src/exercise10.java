import java.util.Scanner;

public class exercise10 {
	//Determine whether the user is tall enough to ride the roller coaster.
	//Prompt the user to enter her height in inches.
	//If she is less than 54 inches tall, notify her that she cannot ride the Raptor.
	//If she is at least 54 inches tall, notify her that she can ride the Raptor.

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userHeight;
		String userContinue = "";
		
		do {
			System.out.println("Enter your height in inches: ");
			userHeight = scnr.nextInt();
			
			if (userHeight < 54) {
				System.out.println("You are too short to ride the raptor.");
			} 
			else if (userHeight >= 54) {
				System.out.println("You can ride the raptor!");
			} else {
				continue;
			}
			
			System.out.println("\nWould you like to continue? (y/n)");
			userContinue = scnr.next();
			userContinue = userContinue.toLowerCase();
			
			
		} while (userContinue.equals("y"));
		
		System.out.println("The End.");
		scnr.close();

	}

}
