/*
 * Name: Kyle Brugmans
 * Assignment: #2 Fall 2019
 * Program: Computer Programming
 * 
 * The program allows the user to input 5 numbers.
 * Displaying the sum, average, square root, and squaring.
 */

package assignment_2_2019;

import java.util.*;

public class FiveNumbers {
	
	static double x1, x2, x3, x4, x5;
	
	public static void userInputNumbers() {
		
		String[] inputConfirmation = {null,
					"\nInput 1 = ",
					"\nInput 2 = ",
					"\nInput 3 = ",
					"\nInput 4 = ",
					"\nInput 5 = ",
					};
		
		@SuppressWarnings("resource")
		Scanner userNumberScanner = 
				new Scanner(System.in);
		
		System.out.print(inputConfirmation[1]);
		x1 = userNumberScanner.nextDouble();
		
		System.out.print(inputConfirmation[2]);
		x2 = userNumberScanner.nextDouble();
		
		System.out.print(inputConfirmation[3]);
		x3 = userNumberScanner.nextDouble();
		
		System.out.print(inputConfirmation[4]);
		x4 = userNumberScanner.nextDouble();
		
		System.out.print(inputConfirmation[5]);
		x5 = userNumberScanner.nextDouble();
		
	}
	
	public static void intialization() {
		
		String enterNumbers = 
				"Please input five numbers:";
		System.out.println
				(enterNumbers);
	}
	
	public static void calculation() {
		
		double sum = x1+x2+x3+x4+x5;
		
		double average = (x1+x2+x3+x4+x5)/5;
		
		double squareRoot = Math.sqrt(sum);
		
		double y1 = Math.pow(x1, 2);
		double y2 = Math.pow(x2, 2);
		double y3 = Math.pow(x3, 2);
		double y4 = Math.pow(x4, 2);
		double y5 = Math.pow(x5, 2);
		
		System.out.printf
				("\nThe sum of all entered numbers = %1.0f\n"
				+ "\nThe average the numbers = %1.2f\n"
				+ "\nThe Sqaure Root of Sum = %1.2f\n"
				+ "\nNum1^2 = %1.2f Num2^2 = %1.2f Num3^2 = %1.2f"
				+ " Num4^2 = %1.2f Num5^2 = %1.2f",
				sum, average, squareRoot, y1, y2, y3, y4, y5);
		
	}
	
	public static void main (String[] args) {
		
		intialization();
		
		userInputNumbers();
		
		calculation();
	}	
}