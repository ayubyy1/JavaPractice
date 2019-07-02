package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat(){
		System.out.println(name + " is eating.");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		//Define properties
		person1.name = "Yaseen";
		person1.email = "ayubyy1@tcnj.edu";
		person1.phone = "6095752024";
		
		//Abstraction: The ability to extract whatever information from the object we want at any time
		person1.walk();
		
		///
		
		person1.sleep();
		person1.eat();
	}
	
	

}
