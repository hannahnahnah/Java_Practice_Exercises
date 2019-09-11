import java.util.Scanner;

public class exercise9 {
	//Prompt the user to enter a language
	//Based on the language the user input, display "Hello, World!" in that language
	//Use a switch statement to choose what to display

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String userContinue = "";
		String userLanguage = "";
		
		
		
		do {
			
			System.out.println("Enter a language (English, Spanish, or Dutch):");
			userLanguage = scnr.nextLine();
			
			userLanguage = userLanguage.toLowerCase();
			
			switch (userLanguage) {
			case "english":
				System.out.println("Hello, World!");
				break;
			case "spanish":
				System.out.println("Hola, Mundo!");
				break;
			case "dutch":
				System.out.println("Hallo, Wereld!");
				break;
			}
			
			System.out.println("Would you like to continue?");
			userContinue = scnr.nextLine();
			
		} while (userContinue.toLowerCase().equals("y"));
		
		System.out.println("Goodbye!\nAdios!\nVaarwel!");
		

	}

}
