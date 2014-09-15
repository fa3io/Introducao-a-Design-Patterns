package aula5.parte2;

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
	
	public double getamount(){
		double amount = 0.0;
		for (Product product : products) {
			amount += product.getPrice();
		}
	return amount;
	}
	
	@Override
	public String toString() {
		String result = "";
		for (Product product : products) {
			result += product.toString(); 
		}
		return result;
	}
}
