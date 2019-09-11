import java.util.Scanner;

public class exercise2 {
	//Prompt the user to enter a number.
	//add 1 and output it back to the console.

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = ((scnr.nextInt()) + 1);
		System.out.println(input);
		

	}

}
