package aula2.parte5;

import java.util.Arrays;

public class GridContainer extends Container {
	
	protected Component[][] elementsArray;
	private int lineCounter;
	private int columCounter;
	private int width;
	private int height;
	
	public GridContainer(int width, int height) {
		this.width = width;
		this.height = height;
		elementsArray = new Component[width][height];
	}
	
	
	@Override
	public void add(Component component) {
		
		if(lineCounter == height && columCounter == width){
			System.out.println("Is not possible add new component");
		}else{
			elementsArray[lineCounter][columCounter] = component;
			columCounter++;
			if(columCounter == width){
				lineCounter++;
				if(lineCounter < height){
					columCounter = 0;
				}
			}
		}
		
		
		
	}

	@Override
	public void remove(Component component) {
		for (int i = 0; i < elementsArray.length; i++) {
			for (int j = 0; j < elementsArray[i].length; j++) {
				if(elementsArray[i][j] == component){
					elementsArray[i][j] = null;
				}
			}
		}
		
		
	}

	@Override
	public void doLayout() {
		System.out.println("The container being used is GridContainer");
		System.out.println("That the elements presented in this container: ");
		System.out.println(Arrays.deepToString(elementsArray));
		System.out.println("Using of inheritance to close the container");
		this.dispose();
		System.out.println("");
		
	}

}
