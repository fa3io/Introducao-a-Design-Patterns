package aula5.parte1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products;
	
	public ShoppingCart() {
		products = new ArrayList<Product>();
	}
	
	public void add(Product product){
		products.add(product);
	}
	
	public double getAmount(){
		double amount = 0.0;
		for (Product product : products) {
			amount += product.getPrice();
		}
		return amount;
	}
}
