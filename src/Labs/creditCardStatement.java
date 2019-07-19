package Labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class creditCardStatement {

	public static void main(String[] args) {
		/* The purpose of this program is to read a credit card CSV statement
		To keep track of the running balance based on the payment type. 
		Then display an appropriate message to the user based on the final balance amount.
		*/
		String filename = "C:\\Users\\ayuby\\OneDrive\\Documents\\Code\\Java\\Files\\CreditCardData.csv";
		String dataRows;
		String[] fields;
		double balance = 0.0;
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		final double fee = 1.10;
		List<String[]> data = new ArrayList<String[]>();
		
		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//Read the file as long as not empty
			while((dataRows = br.readLine()) != null) {
				//Delineate data in each row by comma and store in String[] fields
				fields = dataRows.split(",");
				
				//If the field says CREDIT, then add the amount to the balance
				if(fields[1].equals("CREDIT")) {
					balance += Double.parseDouble(fields[3]);
					System.out.println("You made a purchase of $" + Double.parseDouble(fields[3]) + ".\nYour new balance is $" + numberFormat.format(balance));
				}
				
				//If the field says DEBIT, then subtract the amount to the balance

				if(fields[1].equals("DEBIT")) {
					balance -= Double.parseDouble(fields[3]);
					System.out.println("You made a payment of $" + Double.parseDouble(fields[3]) + ".\nYour new balance is $" + numberFormat.format(balance));
				}
				//If the field says Fee, then add the amount to the balance
				if(fields[1].equals("FEE")) {
					balance += Double.parseDouble(fields[3]);
					System.out.println("You've been charged a fee of $" + Double.parseDouble(fields[3]) + ".\nYour new balance is $" + numberFormat.format(balance));
				}
				//Add String[] containing delineated data to our List Collection
				data.add(fields);
			}
			//If the final amount is greater than zero, charge a 10% fee and warn the user
			if(Double.parseDouble(numberFormat.format(balance)) > 0.0) {
				System.out.println("Due to the outstanding balance on your account of $" + numberFormat.format(balance) + ".\nYou have been charged a 10% fee.\nYou're new balance is: $" + numberFormat.format((balance*=fee)) );
				balance *= fee;
			}
			//If the final amount is zero, thank the user for their payments
			else if(Double.parseDouble(numberFormat.format(balance)) == 0.0)
				System.out.println("Thank You for your payments!");
			//If the final amount is less than zero, thank the user for their payment and display their overpayment.
			else if(Double.parseDouble(numberFormat.format(balance)) < 0.0)
				System.out.println("Thank You for your extra payments! We owe you $" + numberFormat.format((balance*-1)));
			
			//close file
			br.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
