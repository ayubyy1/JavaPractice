package exceptionsfiles;
import java.util.*;

public class PaymentsApp {

	//Take a payment from a user
	public static void main(String[] args) {
		
		// 1. Ask the user for input
		//System.out.print("Enter the payment amount: ");
		double amount = 0;
		boolean positivePayment;
		do {
			positivePayment = true;
			System.out.print("Enter the payment amount: ");
		// 2. Get the amount and test the value
			Scanner input = new Scanner(System.in);
			// 3. Handle exceptions appropriately
			try {
				amount = input.nextDouble();
				if (amount < 0) {
					positivePayment = false;
					throw new NegativePaymentException(amount);					
				}
			}catch(NegativePaymentException e) {
				System.out.println(e.toString());
			}
		}while(!positivePayment);
		// 4. Print confirmation
		System.out.println("Thank you for your payment of $" + amount);

	}

}
