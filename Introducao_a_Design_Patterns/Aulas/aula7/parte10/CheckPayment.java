package aula7.parte10;

public class CheckPayment extends Payment{

	private String bank;

	public CheckPayment(double amount, String bank) {
		super(amount);
		this.bank = bank;
	}

	public String getBank() {
		return bank;
	}

    @Override
    public String toString() {
        return super.toString() + " Bank...: "+getBank();
    }
        
}
