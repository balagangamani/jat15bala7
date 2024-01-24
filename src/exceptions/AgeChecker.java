package exceptions;

import java.util.Scanner;

public class AgeChecker { // InvalidAgeException throw is used here

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Please enter your age: "); // Enter age
			int age = scanner.nextInt(); // Read user input

			// Check if the age is less than 18
			if (age < 18) {
				// If age is < 18, the below statement is displayed
				throw new InvalidAgeException("Access denied - You must be at least 18 years old.");
			} else { // If age is > 18, the below statement is displayed
				System.out.println("Access granted - You are old enough!");
			}
		} catch (InvalidAgeException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input. Please enter a numerical age.");
		} finally {
			scanner.close(); // Close the scanner to prevent resource leaks
		}

	}

}
