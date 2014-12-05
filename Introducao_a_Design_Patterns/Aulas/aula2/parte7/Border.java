package aula2.parte7;

 public abstract class Border {
	protected Container container;
	
	public Border(Container container) {
		this.container = container;
	}
	

	public abstract void generateBorder();

}
