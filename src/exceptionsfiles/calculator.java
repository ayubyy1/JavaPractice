package exceptionsfiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		boolean check;
		boolean check2 = true;
		double a = 0,b = 0;
		String c = "";
		
		//Take in first int while handling errors
		do{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			check = true;
			System.out.print("Please enter the first number: ");
			try{
				//System.out.println("Entered Try block");
				a = input.nextDouble();
			} catch(InputMismatchException e) {
				System.out.println("You did not enter a valid number.");
				check = false;
			}
		}while(!check);
		
		//Take in operation 
		do{
			//System.out.println("Beginning of do loop");
			System.out.print("Please enter an operation(+ - * /): "); //Define an error in a new class
			@SuppressWarnings("resource")
			Scanner input2 = new Scanner(System.in);
			check = true;
			//System.out.println("Check = true");
			
			try{
				//System.out.println("Beginning of try block");
				c = input2.nextLine();
				//System.out.println("c = " + c);
				//System.out.println(c.compareTo("+"));
				if(c.equals("+")|| c.equals("-")|| c.equals("*")|| c.equals("/")){
					check2 = true;
				} 
				if(check2 == false){
					//System.out.println("Invalid Operator");
					throw new invalidOperandException();
				}
								
			} catch(invalidOperandException e) {
				//System.out.println("Entered Catch");
				System.out.println(e.toString());
				check = false;
			}
		} while(check == false);
		
		//Take in second int while handling errors
		do{
			@SuppressWarnings("resource")
			Scanner input3 = new Scanner(System.in);
			System.out.print("Please enter a second number: ");
			check = true;
			try{
				b = input3.nextDouble();
				if (c.equals("/") && b == 0) {
					System.out.println("Entered Divide by Zero");
					throw new divideByZero();
				}
			} catch(InputMismatchException e1) {
				System.out.println("You did not enter a valid number.");
				check = false;
			} catch(divideByZero e2) {
				System.out.println("Entered divByZero Catch");
				System.out.println(e2.toString());
				check = false;
			}
		} while(!check);
		
		
		
		if (c.equals("+"))
			add(a,b);
		else if (c.equals("-"))
			subtract(a,b);
		else if (c.equals("*"))
			multiply(a,b);
		else
			divide(a,b);

	}
	
	public static void add(double a, double b) { 
		System.out.println(a + "" + " + " + b + " = " + (a+b));
	}
	public static void subtract(double a, double b) {
		System.out.println(a + "" + " - " + b + " = " + (a-b));
	}
	public static void multiply(double a, double b) {
		System.out.println(a + "" + " * " + b + " = " + (a*b));
	}
	public static void divide(double a, double b) { //implement try/catch on division by 0
		
			System.out.println(a + "" + " / " + b + " = " + (a/b));
		
	}

}
