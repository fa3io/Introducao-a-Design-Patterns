package aula3.parte3;

public class TennisPlayer extends Player implements Runnable{

	public TennisPlayer(String name) {
		super(name);
	}

	@Override
	public void defineTatics() {
		System.out.println(name + "Likes to beat the ball at the opponnent's backhand");
	}

	@Override
	public void running() {
		System.out.println(name + "needs to run a lot during the game");		
	}

}
