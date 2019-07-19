package exceptionsfiles;

public class commonExceptions {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		//1. Identify the potential problem area
		//2. Surround problem area with try/catch block
		try {
			int c = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Error: Cannot divide by 0 " + e.toString());
		}
		System.out.println("Program Continues");
	}

}
