package aula3.parte1;

public class Version1Test {

	public static void main(String[] args) {
	
		System.out.println("Details of the tennis player");
		
		TennisPlayer tenista = new TennisPlayer("Gustavo Kuerten");
		tenista.train();
		tenista.compete();
		tenista.defineTatics();
		
		
		System.out.println("Details of the soccer player");
		
		SoccerPlayer jogador = new SoccerPlayer("Ronaldinho Gaucho");
		jogador.train();
		jogador.compete();
		jogador.defineTatics();
		
		
		

	}

}
