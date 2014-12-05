package aula3.parte3;

public abstract class Player {
	
	String name;
	
	
	public Player(String name) {
		this.name = name;
	}
	public void train(){
		System.out.println(name + " treina bastante.");
	}
	
	public void compete(){
		System.out.println(name + " is very competitive");
	}
	public abstract void defineTatics();
	
	
	

}
