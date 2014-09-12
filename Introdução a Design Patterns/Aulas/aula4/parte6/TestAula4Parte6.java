package aula4.parte6;

public class TestAula4Parte6 {

	public static void main(String[] args) {
		
		Weapon handGum = new HandGum();
		
		Character leon = new Character("Leon", handGum);
		
		System.out.println(leon.getName()+" playing withthe handgum");
		leon.zoom();
		leon.useWeapon();
		
		System.out.println("\n"+leon.getName()+" playing withthe pistol");

		Weapon pistol = new Pistol();
		leon.setWeapon(pistol);
		leon.zoom();
		leon.useWeapon();
		
		System.out.println("\n"+leon.getName()+" playing withthe pistol");

		Weapon rifle = new Rifle();
		leon.setWeapon(rifle);
		leon.zoom();
		leon.useWeapon();
		
	}

}
