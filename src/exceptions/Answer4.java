package exceptions;

import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: "); // Enter 'a' value
		int a = sc.nextInt();
		System.out.println("Enter value for b: "); // Enter 'b' value
		int b = sc.nextInt();
		int c = 0;

		try {

			c = a / b; // Division

		} catch (ArithmeticException ae) {

			System.out.println("Error: Cannot be divisible by zero."); // 'a' is not divisible by 0
		}

		System.out.println("The value of c: " + c); // Output value of 'c'
	}

}
