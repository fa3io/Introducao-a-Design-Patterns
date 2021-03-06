package aula5.parte5;

public class Facade {

	private DataBase dataBase;
	private Customer customer;
	private Product product;
	
	public Facade() {
		dataBase = new DataBase();
	}
	public void registrar(int id, String name){
		this.customer = new Customer(id, name);

		dataBase.addCustomer(customer);
	}
	
	public void shopping(int productId, int customerId){
		this.customer = dataBase.SelectCustomer(customerId);
		product = dataBase.SelectProdut(productId);
		customer.getShoppingCart().add(product);
	}
	
	public void finishShopping(int customerId){
		this.customer = dataBase.SelectCustomer(customerId);
		double amount = customer.getamount();
		dataBase.processPayment(customer, amount);
	}
}















