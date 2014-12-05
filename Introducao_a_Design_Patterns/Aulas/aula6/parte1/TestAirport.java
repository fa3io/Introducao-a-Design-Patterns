package aula6.parte1;

public class TestAirport {
	
	public static void main(String[] args){
		
		AirportController controlador1 = new AirportController();
		AirportController controlador2 = new AirportController(); 

		controlador1.permissaoDecolar();
		controlador2.permissaoDecolar();// deve falhar
		
		System.out.println("--------------------------------------");
		
		controlador1.permissaoAterrissar();
		controlador2.permissaoAterrissar(); // deve falhar
		
	}

}
