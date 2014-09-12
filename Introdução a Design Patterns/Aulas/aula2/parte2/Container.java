package aula2.parte2;

public abstract class Container {
	
	public void dispose(){
		System.out.println("Fechando Container...");
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract void doLayout();
	
		
	

}
