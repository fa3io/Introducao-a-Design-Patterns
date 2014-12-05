package aula2.parte7;

public class EtchedBorder extends Border {

	public EtchedBorder(Container container) {
		super(container);
	}

	@Override
	public void generateBorder() {
		container.doLayout();
		System.out.println("Border Etched");
		container.dispose();
		System.out.println("");

	}

}
