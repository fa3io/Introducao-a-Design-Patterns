package aula6.parte4;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	public static synchronized EagerSingleton getInstance(){
		return instance;
	}
}
