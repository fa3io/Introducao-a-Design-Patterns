package aula4.parte6;

public class Pistol implements Weapon {

	@Override
	public void load() {
		System.out.println("Loading the Pistol");
	}

	@Override
	public void shoot() {
		System.out.println("Nobody resist a pistol shot");
	}

	@Override
	public void aim() {
		System.out.println("You are under my eyes");
	}

}
