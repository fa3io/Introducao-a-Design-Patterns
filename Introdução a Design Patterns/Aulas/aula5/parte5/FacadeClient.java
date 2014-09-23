package aula5.parte5;


public class FacadeClient {
	public static void main(String[] args) {
		
		Facade facade = new Facade();


		
		facade.registrar(15, "Lula Silva");
		facade.shopping(03,15);
		facade.shopping(01,15);
		facade.shopping(04,15);
		
		
		facade.finishShopping(15);
		
		
	}
}
