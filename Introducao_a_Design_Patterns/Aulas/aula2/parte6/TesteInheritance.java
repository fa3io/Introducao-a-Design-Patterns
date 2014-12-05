package aula2.parte6;

public class TesteInheritance {
	
	public static void  main(String[] args){
		
		//Criando Container Sem Bordas
		
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
		System.out.println("ADICIONANDO ETCHEDBORDER E SOLIDBORDER AO FLOWCONTAINER");
		System.out.println("----------------------------------------------------------");
		
		Container flowEtched = new FlowContainer(new EtchedBorder());
		
		Component RadioButton1 = new Component("RadioButton");
		Component menuBar1 = new Component("MenuBar");
		Component label1 = new Component("Label");
		
		flowEtched.add(RadioButton1);
		flowEtched.add(menuBar1);
		flowEtched.add(label1);
		flowEtched.add(checkBox);
		flowEtched.doLayout();
		
		Container flowSolid = new FlowContainer(new SolidBorder());
		
		
		flowSolid.add(RadioButton1);
		flowSolid.add(menuBar1);
		flowSolid.add(label1);
		flowSolid.add(checkBox);
		flowSolid.doLayout();
			
		System.out.println("----------------------------------------------------------");
		System.out.println("ADICIONANDO ETCHEDBORDER E SOLIDBORDER AO GRIDCONTAINER");
		System.out.println("----------------------------------------------------------");
		
		Container gridEtched = new GridContainer(2, 2,new EtchedBorder());
		
		gridEtched.add(RadioButton1);
		gridEtched.add(menuBar1);
		gridEtched.add(label1);
		gridEtched.add(checkBox);
		gridEtched.doLayout();
		
		Container gridSolid = new GridContainer(2, 2, new SolidBorder());
		
		gridSolid.add(RadioButton1);
		gridSolid.add(menuBar1);
		gridSolid.add(label1);
		gridSolid.add(checkBox);
		gridSolid.doLayout();
				
		System.out.println("----------------------------------------------------------");
		System.out.println("ADICIONANDO COLOR BORDER AO FLOWCONTAINER");
		System.out.println("----------------------------------------------------------");
		
		Container flowColor = new FlowContainer(new ColorBorder());
		
		
		
		flowColor.add(RadioButton1);
		flowColor.add(menuBar1);
		flowColor.add(label1);
		flowColor.add(checkBox);
		flowColor.doLayout();
		
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("ADICIONANDO COLOR BORDER AO GRIDCONTAINER");
		System.out.println("----------------------------------------------------------");
		
		
		
		Container gridColor = new GridContainer(2, 2, new ColorBorder());
		
		gridColor.add(RadioButton1);
		gridColor.add(menuBar1);
		gridColor.add(label1);
		gridColor.add(checkBox);
		gridColor.doLayout();
		
		
		}
}
