import java.util.Scanner;

public class exercise26 {
	
	//prompt the user to enter text
	//count and output how many vowels were in the string
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int vowelCount = 0;
		String userInput = "";
		
		System.out.println("Enter some text: ");
		userInput = scnr.nextLine();
		for (int i = 0; i < userInput.length(); ++i) {
			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'A'
			|| userInput.charAt(i) == 'e' || userInput.charAt(i) == 'E'
			|| userInput.charAt(i) == 'i' || userInput.charAt(i) == 'I'
			|| userInput.charAt(i) == 'o' || userInput.charAt(i) == 'O'
			|| userInput.charAt(i) == 'u' || userInput.charAt(i) == 'U') {
				++vowelCount;
			}
		}
		
		System.out.println("There were " + vowelCount + " vowels.");
		
	}//main

}//class
