package aula4.parte2;

public abstract class SuperAbstractClass {
	
	String nome;
	
	
	public SuperAbstractClass(String nome) {
		this.nome = nome;
	}
	public void concreateMethod(){
		System.out.println("Uma Classe abstrata pode ter tanto metodos concretoos quanto metodos abstratos" +
							"E podemos utilizar qualquer modificador");
	}
	public abstract void abstractMethod();

}
