package aula2.parte5;

import java.util.Arrays;

public class GridContainerSolidBorder extends GridContainer {
	
	
	public GridContainerSolidBorder(int width, int height) {
		super(width, height);
		elementsArray = new Component[width][height];
	}
	
	

	@Override
	public void doLayout() {
		System.out.println("The container being used is GridContainer");
		System.out.println("This container alsocontains an Solid Border around it");
		System.out.println("That the elements presented in this container: ");
		System.out.println(Arrays.deepToString(elementsArray));
		System.out.println("Using of inheritance to close the container");
		this.dispose();
		System.out.println("");
		
	}

}
