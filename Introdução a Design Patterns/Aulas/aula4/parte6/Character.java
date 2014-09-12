package aula4.parte6;

public class Character {
	private String name;
	private Weapon weapon;
	
	public Character(String name, Weapon weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}
	
	public void useWeapon(){
		System.out.println(this.name +" Says: ");
		weapon.shoot();
	}
	
	public void load(){
		System.out.println(this.name +" is ");
		weapon.load();
	}
	
	public void zoom(){
		System.out.println(this.name+" Says:");
		weapon.aim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	
	
	
	
	
}
