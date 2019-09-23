import java.util.ArrayList;
import java.util.Scanner;

public class exercise21 {
	//prompt the user to enter a series of words
	//once the user is done entering the words
	//output a sentence containing all the words
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		String playAgain = "";
		String sentence = "";
		ArrayList<String> sentenceArr = new ArrayList<String>();
		
		do {
			System.out.println("Enter a word: ");
			userInput = scnr.next();
			sentenceArr.add(userInput);
			
			System.out.println("Would you like to enter another word (y/n)? ");
			playAgain = scnr.next();
			
		} while (!playAgain.equalsIgnoreCase("n"));
		
		for (int i = 0; i < sentenceArr.size(); ++i) {
			String temp = sentenceArr.get(i);
			if (i > 0) {
				sentence = sentence + " " + temp;
			} else {
				sentence = temp;
			}
		}
		System.out.println(sentence + ".");
		
		scnr.close();
	}//main
	

}//class
