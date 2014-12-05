package aula2.parte7;

public class SolidBorder extends Border {

	public SolidBorder(Container container) {
		super(container);
	}

	@Override
	public void generateBorder() {
	container.doLayout();
	System.out.println("Solid Border ");
	container.dispose();
	System.out.println("");

	}

}
