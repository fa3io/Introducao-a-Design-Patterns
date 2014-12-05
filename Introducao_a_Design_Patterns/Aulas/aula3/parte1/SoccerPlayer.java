package aula3.parte1;

public class SoccerPlayer extends Player {

	public SoccerPlayer(String name) {
		super(name);
	}

	@Override
	public void defineTatics() {
		System.out.println(name +" Like timework");
	}

}
