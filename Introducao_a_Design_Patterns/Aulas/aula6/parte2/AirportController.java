package aula6.parte2;

public class AirportController {

	private boolean ehPermitidoAterrissar;
	private boolean ehPermitidoDecolar;
	private static AirportController instance = new AirportController();


	private AirportController() {
		ehPermitidoAterrissar = false;
		ehPermitidoDecolar = true;
	}
	
	public static AirportController getInstance(){
		return instance;
	}

	public void permissaoAterrissar(){
		if(ehPermitidoAterrissar){
			System.out.println("Permiss�o de Aterrissagem Concedida !");
			ehPermitidoAterrissar = false;
			ehPermitidoDecolar = true;
		}else {
			System.out.println("Permiss�o para aterrissar Negada !");
		}
	}
	public void permissaoDecolar(){
		if(ehPermitidoDecolar){
			System.out.println("Permiss�o de Decolagem Concedida !");
			ehPermitidoDecolar = false;
			ehPermitidoAterrissar = true;
		}else {
			System.out.println("Permiss�o para Decolagem Negada !");
		}
	}



}
