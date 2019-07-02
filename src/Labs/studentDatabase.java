package Labs;

public class studentDatabase {

	public static void main(String[] args) {
		Student stu1 = new Student("Yaseen", "Ayuby", "142222682");

	}

}

class Student{
	//properties
	private static String ID = "1000";
	private String phone, city, state;
	
	//constructors
	public Student(String firstName, String lastName, String SSN) {
		
		String emailID = lastName + firstName + "@tcnj.edu";
		ID = ID + Integer.toString((int) (Math.random() * (9000 - 1000)) + 1000) + SSN.substring(5);
		System.out.println("ID: " + ID);
	}
	
	//methods
	public void enroll() {}
	public void pay() {}
	public void checkBalance() {}
	public String toString() {return "";}
	public void showCourses() {}
	
	//getters and setters
	public void setPhone(String phone) {
		this.phone = phone;		
	}
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;		
	}
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;		
	}
	public String getState() {
		return state;
	}
	
	
}

