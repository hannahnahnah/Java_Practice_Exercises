import java.util.Scanner;

public class exercise3 {
	//Prompt the user to enter a number.
	//add .5 and output it back to the console.

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double input = ((scnr.nextDouble()) + .5);
		System.out.println(input);
		scnr.close();

	}

}
