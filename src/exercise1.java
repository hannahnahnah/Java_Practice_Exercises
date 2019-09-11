import java.util.Scanner;

public class exercise1 {
	//Prompt the user to enter a string.
	//After the user enters a string, 
	//output the same string back to the console.

	public static void main(String[] args) {
		System.out.println("Enter some text: ");
		Scanner scnr = new Scanner(System.in);
		String input = scnr.nextLine();
		System.out.println(input);
		
		scnr.close();


	}

}
