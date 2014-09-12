package aula3.parte4;

public  class CardPlayer extends Player {

	public CardPlayer(String name, RunBehavior run) {
		super(name, run);
	
	}

	@Override
	public void defineTatics() {
		System.out.println("Stay calm even in the worst situation");
	}
	


}
