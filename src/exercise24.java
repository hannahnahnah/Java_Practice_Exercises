import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise24 {
	//prompt the user to enter a String
	//extract and output the last 10 characters of the String
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userString = "";
		String reverseString = "";
		int stringLength;
		List<Character> charList = new ArrayList<Character>();
		
		System.out.println("Enter some text: ");
		userString = scnr.nextLine();
		stringLength = userString.length();
		
		for (int i = 0; i < stringLength; ++i) {
			char temp = userString.charAt(i);
			charList.add(temp);
		}
		
		for (int i = stringLength; i > (stringLength - 10); --i) {
			reverseString = reverseString + (userString.charAt(i - 1));
		}		
		
		String finishedString = new StringBuilder(reverseString).reverse().toString();
		System.out.println(finishedString);
		
		
		scnr.close();
	}//main

}//class
