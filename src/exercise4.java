import java.util.Scanner;

public class exercise4 {
	//Prompt the user to enter two numbers
	//After the user enters the numbers, add them together and output the sum

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int numberOne = scnr.nextInt();
		
		System.out.println("Enter another number: ");
		int numberTwo = scnr.nextInt();
		
		System.out.println(numberOne + numberTwo);

		scnr.close();
	}

}
