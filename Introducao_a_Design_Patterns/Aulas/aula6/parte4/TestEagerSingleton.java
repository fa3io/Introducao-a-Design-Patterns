package aula6.parte4;

public class TestEagerSingleton {
	
	public static void main(String[] args) {
		
		
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		EagerSingleton singleton2 = EagerSingleton.getInstance();
	
		System.out.println(singleton1 == singleton2 ? "Mesma Instância" : "Diferentes Instâncias");
	}

}
