package aula4.parte4;

public class ConcreteClass extends AbstractClass {

	public ConcreteClass(String nome) {
		super(nome);
		System.out.println("Construtor usado");
		System.out.println("Nome: " + nome + "\n" );
	}

	@Override
	public void method1Interface1() {
		System.out.println("method1Interface1");
		
	}

	@Override
	public void method2Interface1() {
		System.out.println("method2Interface1");
		
	}

	@Override
	public void method3Interface1() {
		System.out.println("method3Interface1");
		
	}

	@Override
	public void method4Interface1() {
		System.out.println("method4Interface1");
	}

	@Override
	public void methosd5Interface1() {
		System.out.println("method5Interface1");
	}

	@Override
	public void methodSuperInterface1() {
		System.out.println("methodSuperInterface1");
		
	}

	@Override
	public void methodSuperInterface2() {
		System.out.println("methodSuperInterface2");	
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstractMethod");	
	}

}
