package aula6.parte5;


public class FacadeClient {
	public static void main(String[] args) {
		
		Facade facade = Facade.getInstance();
		Facade facade2 = Facade.getInstance();

		
		facade.registrar(15, "Lula Silva");
		facade.shopping(03,15);
		facade.shopping(01,15);
		facade.shopping(04,15);
		
		
		facade.finishShopping(15);
		
		System.out.println(facade == facade2 ? "Mesma Instância" : "Instância Diferente");
		
	}
}
