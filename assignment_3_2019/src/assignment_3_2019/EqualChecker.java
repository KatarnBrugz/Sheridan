package assignment_3_2019;

import java.util.Scanner;

public class EqualChecker {
	
	static double numberInput1;
	static double numberInput2;
	
	static double higher;
	static double lower;
	
	static void inputNumbers() {
		
		Scanner userNumberScanner
		= new Scanner(System.in);
		
		numberInput1 = userNumberScanner.nextDouble();
		numberInput2 = userNumberScanner.nextDouble();
	}
	
	public static void floatEqualCheck() {
		
		if (numberInput1 == numberInput2) {
			System.out.printf("%1.2f and %1.2f are equal to one another", numberInput1, numberInput2);
		} else {
			if (numberInput1<numberInput2) {
				lower = numberInput1;
				higher = numberInput2;
			} else {
				higher = numberInput1;
				lower = numberInput2;
			}
			System.out.printf("%1.2f and %1.2f aren't equal. %1.2f is larger than"
					+ " %1.2f", numberInput1, numberInput2, higher, lower);
		}
	}
	
	public static void decimalEqualChecker() {

		if (numberInput1 == numberInput2) {
			System.out.printf("%d and %d are equal to one another", (int)numberInput1, (int)numberInput2);
		} else {
			if (numberInput1<numberInput2) {
				lower = numberInput1;
				higher = numberInput2;
			} else {
				higher = numberInput1;
				lower = numberInput2;
			}
			System.out.printf("%d and %d aren't equal. %d is larger than"
					+ " %d", (int)numberInput1, (int)numberInput2, (int)higher, (int)lower);
		}
		
	}
	
	public static void numberType() {
		
		if (numberInput1 % 1 == 0 && numberInput2 % 1 == 0) {
			decimalEqualChecker();
		} else {
			floatEqualCheck();
		}
	}

	public static void main (String args[]) {
		
		inputNumbers();
		numberType();
		
	}
	
}
