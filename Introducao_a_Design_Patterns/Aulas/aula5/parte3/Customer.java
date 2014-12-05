package aula5.parte3;

public class Customer {
	
	private int id;
	private String name;
	private ShoppingCart cart;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setShoppingCart(ShoppingCart cart){
		this.cart = cart;
	}
	
	public ShoppingCart getShoppingCart(){
		return cart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Custumer ID.....:" +this.id+"\n"+
				"Custumer Name..:"+this.name;
	}
	

}
