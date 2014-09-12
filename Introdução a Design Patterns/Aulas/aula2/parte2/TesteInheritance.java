package aula2.parte2;

public class TesteInheritance {
	
	public static void  main(String[] args){
		
		//Criando Container
		
		Container grid = new GridContainer(2, 2);
		
		Component button = new Component("Button");
		Component textArea = new Component("TextArea");
		Component textFiel = new Component("TextField");
		Component checkBox = new Component("CheckBox");
		
		grid.add(button);
		grid.add(textArea);
		grid.add(textFiel);
		grid.add(checkBox);
		
		grid.doLayout();
		
		Container flow = new FlowContainer();
		
		Component RadioButton = new Component("RadioButton");
		Component menuBar = new Component("MenuBar");
		Component label = new Component("Label");
		
		flow.add(RadioButton);
		flow.add(menuBar);
		flow.add(label);
		flow.add(checkBox);
		
		
		flow.doLayout();
		
		
		
		
		
		}
}
