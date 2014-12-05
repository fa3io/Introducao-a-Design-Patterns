package aula2.parte6;

public abstract class Container {
	
	protected Border border;
	
	public Container(Border border) {
		this.border = border;
	}
	
	public Container() {
	
	}
	
	public void dispose(){
		System.out.println("Fechando Container...");
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract void doLayout();
	
		
	

}
