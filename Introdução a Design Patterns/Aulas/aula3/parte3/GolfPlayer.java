package aula3.parte3;

public class GolfPlayer extends Player implements Runnable {

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
