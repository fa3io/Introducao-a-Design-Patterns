package aula6.parte2;

public class TestAirport {
	
	public static void main(String[] args){
		
		AirportController controlador1 =AirportController.getInstance();
		AirportController controlador2 =AirportController.getInstance(); 

		controlador1.permissaoDecolar();
		controlador2.permissaoDecolar(); // deve falhar
		
		System.out.println("--------------------------------------");
		
		controlador1.permissaoAterrissar();
		controlador2.permissaoAterrissar(); // deve falhar
		
	}

}
