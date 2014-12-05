package aula5.parte4;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	List<Customer> custumers;
	List<Product> produsts;
	
	public DataBase() {
		custumers = new ArrayList<Customer>();
		produsts = new ArrayList<Product>();
		
		custumers.add(new Customer(1, "Fábio"));
		custumers.add(new Customer(2, "Rute"));
		custumers.add(new Customer(3, "Flavio"));
		
		produsts.add(new Product(01, "Mouse", 10.0));
		produsts.add(new Product(02, "Paca de Video", 200.0));
		produsts.add(new Product(03, "Teclado", 30.0));
		produsts.add(new Product(04, "WebCam", 50.0));
	}
	
	public Customer SelectCustomer(int id) {
		for (Customer customer : custumers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}
	public Product SelectProdut(int id) {
		for (Product product :produsts) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}
	public void processPayment(Customer customer, double amount){
		System.out.println("Procesando Pagamento do cliente:\n" +customer);
		System.out.println("Pagamento de R$"+amount+" Realizado com sucesso !!!");
	}
	
	public void addCustomer(Customer customer){
		custumers.add(customer);
	}
	public void addProduct(Product product){
		produsts.add(product);
	}

}
























