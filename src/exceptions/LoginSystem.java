package exceptions;

import java.util.Scanner;

public class LoginSystem { // InvalidPasswordException throw is used here

	// Replace with your actual password verification logic
	private static final String CORRECT_PASSWORD = "correctPassword";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter your password: ");
			String inputPassword = scanner.nextLine(); // Read the user input
			verifyPassword(inputPassword);
		} catch (InvalidPasswordException e) {
			System.out.println("Login failed: " + e.getMessage());
			// Additional logic for logging or responding to the incorrect password
		} finally {
			scanner.close(); // Always close the scanner
		}
	}

	private static void verifyPassword(String inputPassword) throws InvalidPasswordException {
		if (!CORRECT_PASSWORD.equals(inputPassword)) {
			// Instead of just checking for incorrect password, here we throw a custom
			// exception
			throw new InvalidPasswordException("The password you entered is incorrect.");
		}
		System.out.println("Login successful!");
	}
}