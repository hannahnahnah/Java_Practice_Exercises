import java.util.Scanner;

public class exercise27 {
	
	//prompt the user to enter text
	//count and output how many consonants were in the string

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		int consonantCount = 0;
		
		System.out.println("Enter some text: ");
		userInput = scnr.nextLine().toLowerCase();
		
		for (int i = 0; i < userInput.length(); ++i) {
			String eachChar = String.valueOf(userInput.charAt(i));
			if (eachChar.matches("[^aeiou ]")) {
				++consonantCount;
			}
		}
		
		System.out.println("There were " + consonantCount + " consonants.");
		
		
		
	}//main
}//class
