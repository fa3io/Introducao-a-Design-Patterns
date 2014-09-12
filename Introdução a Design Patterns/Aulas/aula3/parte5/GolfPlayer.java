package aula3.parte5;

public class GolfPlayer extends Player {

	public GolfPlayer(String name, RunBehavior run) {
		super(name, run);
	}
	@Override
	public void defineTatics() {
		System.out.println("Try to make at least a PAR in all holes");
		
	}


}
