package aula7.parte11;

public class CreditCardPayment extends Payment{

	private String company;

	public CreditCardPayment(double amount, String company) {
		super(amount);
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}

    @Override
    public String toString() {
        return super.toString()+ " Company...: "+getCompany();
    }
        
        

}
