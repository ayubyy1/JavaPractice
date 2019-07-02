package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("321899571", 1000);
		//BankAccount acc2 = new BankAccount("490213902", 5000);
		//BankAccount acc3 = new BankAccount("093418533", 2000);
		
		acc1.setName("Naseema Ayuby");
		System.out.println(acc1.getName());
		acc1.payBill(500);
		acc1.deposit(300);
		acc1.withdraw(600);	
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	
	//Properties
	private static int iD = 1000; // Internal ID
	private String accountNumber; //iD + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "89315893"; 
	private String name; 
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit){
		this.SSN = SSN;
		balance = initDeposit;
		iD++;
		setAccountNumber();
	}	
	
	//Methods
	public void deposit(double Amount) {
		System.out.println("Making Deposit: " + Amount);
		balance += Amount;
		checkBalance();
	}
	public void withdraw(double Amount) {
		System.out.println("Making Withdrawal: " + Amount);
		balance -= Amount;
		checkBalance();
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public void payBill(double Amount) {
		System.out.println("Paying Bill: " + Amount);
		balance -= Amount;
		checkBalance();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	@Override
	public void accrue() {
		balance *= (1 + rate/100);
		checkBalance(); 
	}
	
	@Override
	public String toString() {
		return ("[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]");
	}
	//Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	
}
