package aula3.parte3;

public  class CardPlayer extends Player implements Runnable {

	public CardPlayer(String name) {
		super(name);
	
	}

	@Override
	public void defineTatics() {
		System.out.println("Stay calm even in the worst situation");
	}
	
	@Override
	public void running() {
		System.out.println(name + " thinks, doesnt run");
	}

}
