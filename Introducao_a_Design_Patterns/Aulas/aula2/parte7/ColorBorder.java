package aula2.parte7;

public class ColorBorder extends Border {

	public ColorBorder(Container container) {
		super(container);
	}

	@Override
	public void generateBorder() {
		container.doLayout();
		System.out.println("Color border");
		container.dispose();

	}

}
