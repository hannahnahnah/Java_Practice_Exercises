import java.util.ArrayList;
import java.util.Scanner;

public class exercise25 {
	
	//prompt the user to enter a sentence
	//split the sentence into individual words
	//and display each word on its own line
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		
		System.out.println("Enter a sentence: ");
		userInput = scnr.nextLine();
		String[] stringArr = userInput.split("\\s");
		
		for (int i = 0; i < stringArr.length; ++i) {
			System.out.println(stringArr[i]);
		}
		
		
	}//main

}//class
