package aula6.parte3;

public class TestSingletonIngenuo {
	
	public static void main(String[] args) {
		
		
		LazySingleton singleton1 = LazySingleton.getInstance();
		LazySingleton singleton2 = LazySingleton.getInstance();
	
		System.out.println(singleton1 == singleton2 ? "Mesma Instância" : "Diferentes Instâncias");
	}

}
