import java.util.Scanner;

public class exercise20 {
	//prompt the user to enter a number. 
	//use a for-loop to calculate the product of the number 
	//and the two preceding numbers

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNumber = 0;
		int product = 1;
		
		System.out.println("Enter a number: ");
		userNumber = scnr.nextInt();
		
		for (int i = (userNumber - 2); i <= userNumber; ++i) {
			product = product * i;
		}
		System.out.println("The product of " + userNumber + ", " +
						   (userNumber - 1) + ", and " + (userNumber - 2) + 
						   " is " + product + ".");
		
	
	}

}
