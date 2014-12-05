package aula3.parte4;

public class TennisPlayer extends Player {

	public TennisPlayer(String name, RunBehavior run) {
		super(name, run);
	}

	@Override
	public void defineTatics() {
		System.out.println(name + "Likes to beat the ball at the opponnent's backhand");
	}

}
