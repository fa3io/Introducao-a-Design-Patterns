package aula3.parte5;

public abstract class Player {
	private RunBehavior runBehavior;
	String name;
	
	
	protected Player(String name, RunBehavior runBehavior) {
		this.name = name;
		this.runBehavior = runBehavior;
	}
	public void train(){
		System.out.println(name + " treina bastante.");
	}
	
	public void compete(){
		System.out.println(name + " is very competitive");
	}
	public abstract void defineTatics();
	
	public void performedRunning(){
		runBehavior.running();
	}
	public void  setRunninBehavior(RunBehavior runBehavior){
		this.runBehavior = runBehavior;
	}
	

}
