package aula3.parte2;

public class TennisPlayer extends Player {

	public TennisPlayer(String name) {
		super(name);
	}

	@Override
	public void defineTatics() {
		System.out.println(name + "Likes to beat the ball at the opponnent's backhand");
	}

}
