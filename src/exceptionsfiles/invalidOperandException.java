package exceptionsfiles;

public class invalidOperandException extends Exception{

	@Override
	public String toString() {
		return "Error: Please enter one of the following operators (+ - * /)";
	}
	
}
