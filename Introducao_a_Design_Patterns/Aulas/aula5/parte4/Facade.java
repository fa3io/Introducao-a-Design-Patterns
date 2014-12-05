package aula5.parte4;

public class Facade {

	private DataBase dataBase;
	private Customer customer;
	private ShoppingCart shoppingCart;
	private Product product;
	
	public Facade() {
		dataBase = new DataBase();
	}
	public void registrar(int id, String name){
		this.customer = new Customer(id, name);
		shoppingCart = new ShoppingCart();
		customer.setShoppingCart(shoppingCart);
		dataBase.addCustomer(customer);
	}
	
	public void shopping(int productId, int customerId){
		this.customer = dataBase.SelectCustomer(customerId);
		product = dataBase.SelectProdut(productId);
		customer.getShoppingCart().add(product);
	}
	
	public void finishShopping(int customerId){
		this.customer = dataBase.SelectCustomer(customerId);
		double amount = customer.getShoppingCart().getamount();
		dataBase.processPayment(customer, amount);
	}
}















