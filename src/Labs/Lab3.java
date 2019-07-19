package Labs;

import java.io.*;

public class Lab3 {
	static boolean hasNum(char letter){
		String numbers = "1234567890";
		CharSequence sequence = letter+"";
		if (numbers.contains(sequence))
			return true;
		return false;
	}
	static boolean hasLetter(char letter){
		String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CharSequence sequence = letter+"";
		if (letters.contains(sequence))
			return true;
		return false;
	}
	static boolean hasSpecial(char letter){
		String characters = "!@#$%^&*()_+=-`~,.?'\"";
		CharSequence sequence = letter+"";
		if (characters.contains(sequence)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//The purpose of this program is to read passwords from a text file
		//And verify that all of the passwords meet the criteria and if not
		//Throws the exception for the given criteria
		
		// 1. Specify the Path of the file to read
		String filename = "C:\\Users\\ayuby\\OneDrive\\Documents\\Code\\Files\\Passwords.txt";
		//String password = null;
		// 2. Create file in java
		File file = new File(filename);
		// Create Array to take in multiple lines of data
		String[] passwords = new String[13];
		try{	
			// 3. Open File
			BufferedReader br = new BufferedReader(new FileReader(file));
			// 4. Read The File
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}
			// 5. Close Resources
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}catch(IOException e) {
			System.out.println(e.toString());			
		}
		
		for (int i = 0; i < passwords.length; i++) {
			try {
				boolean oneNumber=false, oneLetter=false, oneChar=false;
				for(int j = 0; j < passwords[i].length(); j++) {
					if (hasNum(passwords[i].charAt(j))) {
						oneNumber = true;
					}
					if (hasLetter(passwords[i].charAt(j))) {
						oneLetter = true;
					}
					if (hasSpecial(passwords[i].charAt(j))) {
						oneChar = true;
					}
				}
				if(!oneNumber) {
					throw new NoNumberException(passwords[i]);
				}
				if(!oneLetter) {
					throw new NoLetterException(passwords[i]);
				}
				if(!oneChar) {
					throw new NoSpecialException(passwords[i]);
				}
				System.out.println("Password: "+ passwords[i]);
			}catch(NoNumberException e) {
				System.out.println(e.toString());
			}catch(NoLetterException e) {
				System.out.println(e.toString());
			}catch(NoSpecialException e) {
				System.out.println(e.toString());
			}//End Try
		
		}

	}
}

class NoNumberException extends Exception{
	String password;
	
	NoNumberException(String password){
		this.password = password;
	}
	
	public String toString() {
		return ("The password " + password + " must have at least one number.");
	}
}
class NoLetterException extends Exception{
	String password;
	
	NoLetterException(String password){
		this.password = password;
	}
	
	public String toString() {
		return ("The password " + password + " must have at least one letter.");
	}
}
class NoSpecialException extends Exception{
	String password;
	
	NoSpecialException(String password){
		this.password = password;
	}
	
	public String toString() {
		return ("The password " + password + " must have at least one special character(!@#$).");
	}
}
