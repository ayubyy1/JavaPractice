package Labs;

import java.io.*;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This app will read a text file and retrieve the phone numbers
		// Valid phone number: 
				//10 digits long
				//Area code cannot start in 0 or 9
				//There can be no 911 in the phone
		String filename = "C:\\Users\\ayuby\\OneDrive\\Documents\\Code\\Files\\PhoneNumber.txt";
		String[] numbers = new String[4];
		String number = null;
		
		File file = new File(filename);
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				
				for(int i = 0; i < numbers.length; i++) {
					numbers[i] = br.readLine();
				}
				br.close();
							
			} catch (FileNotFoundException e) {
				System.out.println("ERROR File Not Found: " + filename);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("ERROR Input Cannot be read: " + filename);
				e.printStackTrace();
			}
		for(int i = 0; i < numbers.length; i++) {
			number = numbers[i];
			try{
				if(number.length() != 10)
					throw new TenDigitException(number);
				if(number.substring(0,1).equals("0") || number.substring(0,1).equals("9"))
					throw new AreaCodeException(number);
				if (number.contains("911"))
					throw new PoliceException(number);
				System.out.println(number);
				
			}catch(TenDigitException e){
				System.out.println(e.toString());
			}catch(AreaCodeException e){
				System.out.println(e.toString());
			}catch(PoliceException e){
				System.out.println(e.toString());		
			}
		}

	}

}

class TenDigitException extends Exception{
	String number;
	public TenDigitException(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return ("ERROR Number is not 10 digits long: " + number);
	}
}
class AreaCodeException extends Exception{
	String number;
	public AreaCodeException(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return ("ERROR Area code must not begin with 0 or 9: " + number);
	}
}
class PoliceException extends Exception{
	String number;
	public PoliceException(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return ("ERROR Number must not contain 911: " + number);
	}
}

