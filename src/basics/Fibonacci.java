package basics;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(myFib(45));

	}

	public static int myFib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return (myFib(n-1) + myFib(n-2));
	}
}
