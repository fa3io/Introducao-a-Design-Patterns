package aula2.parte4;

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
		System.out.println("NOVOS REQUESITOS DO CLENTE FLOWCONTAINER");
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
		
		System.out.println("----------------------------------------------------------");
		System.out.println("NOVOS REQUESITOS DO CLENTE GRIDCONTAINER");
		System.out.println("----------------------------------------------------------");
		
		Container gridEtched = new GridContainerEtchedBorder(2, 2);
		
		gridEtched.add(RadioButton1);
		gridEtched.add(menuBar1);
		gridEtched.add(label1);
		gridEtched.add(checkBox);
		gridEtched.doLayout();
		
		Container gridSolid = new GridContainerSolidBorder(2, 2);
		
		gridSolid.add(RadioButton1);
		gridSolid.add(menuBar1);
		gridSolid.add(label1);
		gridSolid.add(checkBox);
		gridSolid.doLayout();
		
		
		
		
		}
}
