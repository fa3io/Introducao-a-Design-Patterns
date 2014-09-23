package aula6.parte1;

public class AirportController {

	private boolean ehPermitidoAterrissar;
	private boolean ehPermitidoDecolar;


	public AirportController() {
		ehPermitidoAterrissar = false;
		ehPermitidoDecolar = true;
	}

	public void permissaoAterrissar(){
		if(ehPermitidoAterrissar){
			System.out.println("Permissão de Aterrissagem Concedida !");
			ehPermitidoAterrissar = false;
			ehPermitidoDecolar = true;
		}else {
			System.out.println("Permissão para aterrissar Negada !");
		}
	}
	public void permissaoDecolar(){
		if(ehPermitidoDecolar){
			System.out.println("Permissão de Decolagem Concedida !");
			ehPermitidoDecolar = false;
			ehPermitidoAterrissar = true;
		}else {
			System.out.println("Permissão para Decolagem Negada !");
		}
	}



}
