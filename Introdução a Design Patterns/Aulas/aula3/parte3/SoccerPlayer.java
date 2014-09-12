package aula3.parte3;

public class SoccerPlayer extends Player implements Runnable {

	public SoccerPlayer(String name) {
		super(name);
	}

	@Override
	public void defineTatics() {
		System.out.println(name +" Like timework");
	}

	@Override
	public void running() {
		System.out.println(name + "needs to run a lot during the game");
	}

}
