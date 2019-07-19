package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e","f"};
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println("\n\nUsing the For-Each method");
		for(String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		String[][] users = { 
					{"Yaseen","Ayuby","ya@testemail.com","8951325425"},
					{"Naseema","Khan","nk@testemail.com","4381934284"},
					{"Mohsin","Ayuby","ma@testemail.com","9019420349"} 
				};
		
		//Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("\nNumber of Users: " + numOfUsers);
		System.out.println("Number of Fields: " + numOfFields);
		
		//Traverse the Multi-Dim Array
		for(int i = 0; i < numOfUsers; i++) {
			for(int j = 0; j < numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("");
		}
	}
}


