package exceptions;

public class Answer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] numbers = { 1, 2, 3 };
			// Accessing the 4th element in an array with only 3 elements
			System.out.println(numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds: " + e.getMessage());
		}

		// Demonstrating StringIndexOutOfBoundsException
		try {
			String text = "Hello";
			// Accessing the 6th character in a String with only 5 characters
			System.out.println(text.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index is out of bounds: " + e.getMessage());
		}

	}

}
