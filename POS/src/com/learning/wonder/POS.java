package com.learning.wonder;

/*
 * KYLE BRUGMANS
 * POS System - (Point of sale) system
 * Testing how to make a console
 * based POS via Number input and response
 */

import java.util.Scanner;

public class POS {
	
	public static void midPoint() {
		
		double PX = 2;
		double PY = 1;
		
		double QX = 5.5;
		double QY = 7.5;
		
		double answer1 = (QX+PX)/2;;
		double answer2 = (QY+PY)/2;
		
		System.out.printf("The midpoint of the line is (%1.1f), (%1.1f)",
				answer1, answer2);
	}
	
	public static void catalog() {
		
		String catalog[] = {null,"Notebook", "Pencil", "iPhone"};
		String itemChosen = "\nItem id = ";
		String boarder =  "\n------------------";
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		
		System.out.println
				("Enter in the item you want\n"
				+ "(1)"+catalog[1]+"\n"
				+ "(2)"+catalog[2]+"\n"
				+ "(3)"+catalog[3]+"\n");
		
		int userInput = myObj.nextInt();
		
			switch(userInput) {
			case 1:
				System.out.println(boarder+itemChosen+catalog[1]+boarder);
				break;
			case 2:
				System.out.println(boarder+itemChosen+catalog[2]+boarder);
				break;
			case 3:
				System.out.println(boarder+itemChosen+catalog[3]+boarder);
				break;
			default:
				System.out.println
				("\nERROR ITEM CODE: "+userInput+
				" DOES NOT EXIST\n");
				catalog();
			}
		
	}
	
	public static void saleIntialization() {
		
		catalog();
		
	}

	public static void main (String args[]) {
		
		//midPoint();
		
		saleIntialization();
		
	}
	
}
