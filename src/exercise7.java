import java.util.Scanner;

public class exercise7 {
	//Use a do-while loop to run exercise 1 in a loop.
	//Each time you run the code, ask the user if they would like to continue

	public static void main(String[] args) {
		
		
		String userContinue = "";
		
		do {
		
			System.out.println("Enter some text: ");
		Scanner scnr = new Scanner(System.in);
		String input = scnr.nextLine();
		System.out.println(input);
		
		System.out.println("Would you like to continue? (y/n)");
		userContinue = scnr.nextLine();
		userContinue = userContinue.toLowerCase();
		
	

		
		} while (userContinue.equals("y"));
		
		System.out.println("All Done.");
		
	}

}
