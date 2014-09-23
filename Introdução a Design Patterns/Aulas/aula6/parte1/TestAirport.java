package aula6.parte1;

public class TestAirport {
	
	public static void main(String[] args){
		
		AirportController controlador1 = new AirportController();
		AirportController controlador2 = new AirportController(); // deve falhar

		controlador1.permissaoDecolar();
		controlador2.permissaoDecolar();
		
		System.out.println("--------------------------------------");
		
		controlador1.permissaoAterrissar();
		controlador2.permissaoAterrissar(); // deve falhar
		
	}

}
