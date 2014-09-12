package aula4.parte5;

public class HandGum implements Weapon {

	@Override
	public void load() {
		System.out.println("Loading handgum");

	}

	@Override
	public void shoot() {
		System.out.println("Can you resistthis shot");

	}

	@Override
	public void aim() {
		System.out.println("I can see you");

	}

}
