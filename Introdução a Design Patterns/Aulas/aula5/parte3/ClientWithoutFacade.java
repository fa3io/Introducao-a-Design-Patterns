package aula5.parte3;

public class ClientWithoutFacade {

	public static void main(String[] args) {
		
		DataBase banco_de_dados = new DataBase();
		
		Customer rodrigo = new Customer(10, "Rodrigo");
		
		banco_de_dados.addCustomer(rodrigo);
		
		ShoppingCart carrinho = new ShoppingCart();
		
		rodrigo.setShoppingCart(carrinho);
		
		Product p1 = banco_de_dados.SelectProdut(1);
		Product p2 = banco_de_dados.SelectProdut(3);
		
		rodrigo.getShoppingCart().add(p1);
		rodrigo.getShoppingCart().add(p2);
		
		double amount = rodrigo.getShoppingCart().getamount();
		
		banco_de_dados.processPayment(rodrigo, amount);
		
		
		
		
	}
}
