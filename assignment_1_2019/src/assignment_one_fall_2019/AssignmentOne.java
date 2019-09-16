/*
 * Name: Kyle Brugmans
 * Assignment: #1 Fall 2019
 * Program: Computer Programming
 * 
 * This program shows basic understandings
 * of using print and println.
 */

package assignment_one_fall_2019;

public class AssignmentOne {
	
	static String myName = ("Kyle Brugmans");
	
	static void starLine() {
		for (int i=0; i < 67; i++) {
			System.out.print("*");
			}
	}

	public static void main(String[] args) {
		
		starLine();
		System.out.println();
		
		for (int i=0; i<28; i++) { 
			System.out.print(" ");		
		}
		
		System.out.println(myName);
		
		for (int i=0; i<24; i++) { 
			System.out.print(" ");		
		}
		
		System.out.println("This is Assignment #1");
		
		for (int i=0; i<33; i++) { 
			System.out.print(" ");
		}	
		
		System.out.println((9875+1020)/4);
		
		System.out.println("\"print\" outputs text to current line. \"println\" creates a new line after output.");
		
		starLine();
	

	}

}
