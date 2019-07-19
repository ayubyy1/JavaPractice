package exceptionsfiles;

public class NegativePaymentException extends Exception {
	double payment;
	
	public NegativePaymentException(double payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Error: Cannot take negative payment " + payment;
	}
}
