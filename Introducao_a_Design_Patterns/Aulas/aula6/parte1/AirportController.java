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
