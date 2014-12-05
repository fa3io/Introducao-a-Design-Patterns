package aula6.parte2;

public class SingletonIngenuo {

	private SingletonIngenuo() {
		
	}
	public static SingletonIngenuo getInstance(){
		return new SingletonIngenuo();
	}
}
