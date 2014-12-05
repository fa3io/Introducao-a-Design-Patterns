package aula4.parte2;

public class Abstract_Interface_Teste {
	
	public static void main(String[] args){
		
		//SuperAbstractClass s = new SuperAbstractClass();
		//Interface1 i = new Interface1();
		
		ConcreteClass conc = new ConcreteClass("Fábio Santos Alves");
		
		SuperAbstractClass sa = new ConcreteClass("Luiz Silva Alves");
		
		SuperInterface si = new ConcreteClass("Rosalina Silva Santos");
		
		ConcreteClass cc = new ConcreteClass("Flavio Santos Alves");
		
		System.out.println(Interface1.CONST_1);
		System.out.println(Interface2.CONST_2);
		System.out.println(Interface2.anotherVariable);
		
		
		
		cc.abstractMethod();
		
		cc.method1Interface1();
		cc.method2Interface1();
		cc.method3Interface1();
		cc.method4Interface1();
		cc.methosd5Interface1();
		
		cc.methodSuperInterface1();
		cc.methodSuperInterface2();
		
		cc.concreateMethod();
		
	}

}
