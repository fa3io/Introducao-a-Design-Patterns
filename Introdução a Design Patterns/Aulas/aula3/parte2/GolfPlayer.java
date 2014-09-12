package aula3.parte2;

public class GolfPlayer extends Player {

	public GolfPlayer(String name) {
		super(name);
	}

	@Override
	public void defineTatics() {
		System.out.println("Try to make at least a PAR in all holes");
		
	}
	@Override
	public void running() {
	}

}
