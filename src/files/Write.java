package files;

import java.io.*;

public class Write {

	public static void main(String[] args) {
		
		// 1. Define the path of the file to write.
		String filename = "C:\\Users\\ayuby\\OneDrive\\Documents\\Files\\FileToWrite.txt";
		String message = "I'm writing data to this file.";
		
		// 2. Create the file in Java.
		File file = new File(filename);
		
		
		
		
		try {
			// 3. Open the file.
			FileWriter fw = new FileWriter(file);
			
			// 4. Write to the file.
			fw.write(message);
			
			// 5. Close the resources.
			fw.close();
			
		} catch (IOException e) {
			System.out.println("ERROR Could not write file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file writer.");
		}
		
		
		
		

	}

}
