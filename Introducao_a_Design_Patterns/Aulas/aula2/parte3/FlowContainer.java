package aula2.parte3;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {
	
	private List<Component> elements;

	public FlowContainer() {
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
		System.out.println("The container being used is FlowContainer");
		System.out.println("That the elements presented in this container: ");
		System.out.println(elements);
		System.out.println("Using of inheritance to close the container");
		this.dispose();
		System.out.println("");
	}
	
}
