import java.util.Scanner;

public class exercise5 {
	//Prompt the user to enter two numbers
	//After the user enters the numbers, multiply them and output the product

	public static void main(String[] args) {
		
			
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Enter a number: ");
			double numberOne = scnr.nextDouble();
			
			System.out.println("Enter another number: ");
			double numberTwo = scnr.nextDouble();
			
			double outPut = numberOne * numberTwo;
			
			System.out.println("The product is: " + outPut);

			scnr.close();
		

	}

}
