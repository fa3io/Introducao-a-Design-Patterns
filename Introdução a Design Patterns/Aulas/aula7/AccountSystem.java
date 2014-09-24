package aula7;

public class AccountSystem {
	
	private String name;
	
	public AccountSystem(String system) {
		this.name = system;
	}
	
	public void registerSale(){
		System.out.println("Venda registrada em em "+ name + "Sistema Financeiro.\n");
	}
	public void calculeTax(){
		System.out.println("Taxa calculada em "+ name +" Sistema Financeiro.\n");
	}

}
