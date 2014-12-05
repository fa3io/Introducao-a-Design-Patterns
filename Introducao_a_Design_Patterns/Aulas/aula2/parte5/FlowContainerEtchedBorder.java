package aula2.parte5;

public class FlowContainerEtchedBorder extends FlowContainer {
	

	@Override
	public void doLayout() {
		System.out.println("The container being used is FlowContainerEtchedBorder");
		System.out.println("This container alsocontains an Etched Border around it");
		System.out.println("That the elements presented in this container: ");
		System.out.println(elements);
		System.out.println("Using of inheritance to close the container");
		this.dispose();
		System.out.println("");
		
	}

}
