package exceptions;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		// Corrected path as a String, not as a Path object for FileReader
		String filePath = "E:\\EclipseClass\\jat15bala7\\src\\exceptions\\abc.txt";

		try {
			FileReader fileReader = new FileReader(filePath); // Use filePath here
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close(); // Close the stream
		} catch (FileNotFoundException e) {
			System.out.println("Error: The file does not exist or could not be found.");
		} catch (IOException e) {
			System.out.println("Error: There was an error reading the file.");
		}
	}
}
