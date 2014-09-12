package aula3.parte5;

public class ChessPlayer extends Player {

	public ChessPlayer(String name, RunBehavior run) {
		super(name, run);
	}

	@Override
	public void defineTatics() {
		System.out.println("Dominate the center of the board game");
	}
	
	

}
