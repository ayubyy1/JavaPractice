package basics;

public class myFactorial {
	public static void main(String[] args) {
		
		System.out.println(Factorial(1));
		
	}
	
	public static int Factorial(int n) {
		if (n == 0)
			return 1;
		return (n * Factorial(n-1));
	}
}
