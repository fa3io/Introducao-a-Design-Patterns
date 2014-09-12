package aula2.parte3;

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
		
		System.out.println("----------------------------------------------------------");
		System.out.println("NOVOS REQUESITOS DO CLENTE");
		System.out.println("----------------------------------------------------------");
		
		Container flowEtched = new FlowContainerEtchedBorder();
		
		Component RadioButton1 = new Component("RadioButton");
		Component menuBar1 = new Component("MenuBar");
		Component label1 = new Component("Label");
		
		flowEtched.add(RadioButton1);
		flowEtched.add(menuBar1);
		flowEtched.add(label1);
		flowEtched.add(checkBox);
		flowEtched.doLayout();
		
		Container flowSolid = new FlowContainerSolidBorder();
		
		
		
		flowSolid.add(RadioButton1);
		flowSolid.add(menuBar1);
		flowSolid.add(label1);
		flowSolid.add(checkBox);
		flowSolid.doLayout();
		
		
		
		
		
		}
}
