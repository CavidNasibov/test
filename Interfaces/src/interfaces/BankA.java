package interfaces;

public class BankA implements Bank{

	@Override
	public double interestRate() {
		
		return 3.4;
	}

	@Override
	public double internationalTransactionFree() {
		
		return 5;
	}

}
