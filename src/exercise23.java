import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class exercise23 {
	//prompt the user to enter a string
	//extract and output the first ten characters of the string
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter some text: ");
		String userString = scnr.next();
		System.out.println("The first ten characters were: ");
		for (int i = 0; i < userString.length(); ++i) {
			if (i < 10) {
			System.out.print(userString.charAt(i) + " ");
			}
		}
		
		
	}//main

}//class
