package aula7.parte11;

public abstract class Payment {
	
	private double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

    @Override
    public String toString() {
        return "Total...: R$ "+getAmount()+ "\n";
    }
        
        

}
