package aula6.parte4;

public class TestStaticSingleton {

	public static void main(String[] args) {
		
		StaticSingleton staticSingleton1 = StaticSingleton.instance;
		StaticSingleton staticSingleton2 = StaticSingleton.instance;
		
		System.out.println(staticSingleton1 == staticSingleton2 ? "Mesma Instância" : "Diferentes Instâncias");
	
	}
}
