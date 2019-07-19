package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		String filename = "C:\\Users\\ayuby\\OneDrive\\Documents\\Code\\Java\\Files\\accounts.csv";
		String dataRow; //String which will be read from file
		String[] accounts; //Array which will take dataRow and parse by ","
		List<String[]> data = new ArrayList<String[]>(); //List of String[] account which will dynamically take in data from csv
		
		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//Read the file as long as not empty
			while((dataRow = br.readLine()) != null) {
				//delineate rows of csv file data by "," and add to an array
				accounts = dataRow.split(",");
				//take above array and add to ArrayList
				data.add(accounts);
			}
			//Close File
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Print out accounts
		for(String[] account: data) {
			for(String field: account) {
				System.out.print(field + " ");
			}
			System.out.println("");
		}
	}

}
