package aula4.parte6;

public class Rifle implements Weapon {

	@Override
	public void load() {
		System.out.println("Loading the Rifle");
	}

	@Override
	public void shoot() {
		System.out.println("Shooting the kill babe !");
	}

	@Override
	public void aim() {
		System.out.println("Zooooooom");
	}

}
