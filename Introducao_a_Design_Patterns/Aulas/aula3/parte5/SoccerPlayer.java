package aula3.parte5;

public class SoccerPlayer extends Player {

	public SoccerPlayer(String name, RunBehavior run) {
		super(name, run);
	}

	@Override
	public void defineTatics() {
		System.out.println(name +" Like timework");
	}

}
