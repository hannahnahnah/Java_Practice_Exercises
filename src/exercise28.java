import java.util.ArrayList;
import java.util.Scanner;

public class exercise28 {
	//prompt the user to enter text
	//remove all the vowels and output the text
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		ArrayList<String> charArr = new ArrayList<String>();
		
		System.out.println("Enter some text: ");
		userInput = scnr.nextLine().toLowerCase();
		
		for (int i = 0; i < userInput.length(); ++i) {
			String eachChar = String.valueOf(userInput.charAt(i));
			if (eachChar.matches("[^aeiou]")) {
				charArr.add(eachChar);
			}
		}
		
		for (int i = 0; i < charArr.size(); ++i) {
			System.out.print(charArr.get(i));
		}
		
		
	}//main

}//class
