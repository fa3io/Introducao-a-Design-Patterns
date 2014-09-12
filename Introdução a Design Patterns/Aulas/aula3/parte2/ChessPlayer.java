package aula3.parte2;

public class ChessPlayer extends Player {

	public ChessPlayer(String name) {
		super(name);
	}

	@Override
	public void defineTatics() {
		System.out.println("Dominate the center of the board game");
	}
	
	@Override
	public void running() {
		System.out.println(name + " thinks, doesnt run");
	}

}
