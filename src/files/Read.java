package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Read {

	public static void main(String[] args) {
		//1. Define the file/path that we want to read
		String fileName = "C:\\Users\\ayuby\\OneDrive\\Documents\\Files\\FileToRead.txt";
		String text = null;
		
		//2. Create the File in Java
		File file = new File(fileName);
		
		
		//3. Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			//4. Read the file
			 text = br.readLine();
			 
			//5. Close the resources
			 br.close();
			 
		} catch (FileNotFoundException e) {
			System.out.println("ERROR File not Found: " + fileName);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR Could not read the data: " + fileName);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
		
	}

}
