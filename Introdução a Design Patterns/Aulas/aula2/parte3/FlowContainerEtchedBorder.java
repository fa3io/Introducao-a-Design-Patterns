package aula2.parte3;

import java.util.ArrayList;
import java.util.List;

public class FlowContainerEtchedBorder extends Container {
	private List<Component> elements;
	
	public FlowContainerEtchedBorder() {
		elements = new ArrayList<Component>();
	}
	@Override
	public void add(Component component) {
		elements.add(component);
		
	}

	@Override
	public void remove(Component component) {
		elements.remove(component);
		
	}

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
