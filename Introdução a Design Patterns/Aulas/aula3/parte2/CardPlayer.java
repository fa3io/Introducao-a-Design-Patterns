package aula3.parte2;

public  class CardPlayer extends Player {

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
