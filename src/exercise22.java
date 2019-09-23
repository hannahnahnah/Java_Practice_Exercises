import java.util.Scanner;

public class exercise22 {
	//prompt the user to enter two numbers that will determine a range
	//prompt the user to enter another number
	//determine if that number is within the range
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int firstNum;
		int secondNum;
		int thirdNum;
		int lowEnd;
		int highEnd;
		
		System.out.println("Enter a number: ");
		firstNum = scnr.nextInt();
		
		System.out.println("Enter another number: ");
		secondNum = scnr.nextInt();
		if (firstNum < secondNum) {
			lowEnd = firstNum;
			highEnd = secondNum;
		} else {
			lowEnd = secondNum;
			highEnd = firstNum;
		}
		System.out.println("Your range is " + lowEnd + "-" + highEnd + ".");
		System.out.println("Enter a number for verification: ");
		thirdNum = scnr.nextInt();
		
		if (thirdNum >= lowEnd && thirdNum <= highEnd) {
			System.out.println(thirdNum + " is in the range.");
		} else {
			System.out.println(thirdNum + " is outside the range.");
		}
		
		scnr.close();
	}//main

}//class
