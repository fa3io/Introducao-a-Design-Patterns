package aula3.parte2;

public class Version2Test {

	public static void main(String[] args) {
	
		System.out.println("Details of the tennis player");
		
		TennisPlayer tenista = new TennisPlayer("Gustavo Kuerten");
		tenista.train();
		tenista.compete();
		tenista.defineTatics();
		tenista.running();
		System.out.println("");
		
		
		System.out.println("Details of the soccer player");
		
		SoccerPlayer jogador = new SoccerPlayer("Ronaldinho Gaucho");
		jogador.train();
		jogador.compete();
		jogador.running();
		jogador.defineTatics();
		System.out.println("");
		
		
		System.out.println("Details of the Card player");
		
		CardPlayer card = new CardPlayer("Bob");
		card.train();
		card.compete();
		card.running();
		card.defineTatics();
		System.out.println("");
		
		
		System.out.println("Details of the Chess player");
		
		ChessPlayer chess = new ChessPlayer("Kasparov");
		chess.train();
		chess.compete();
		chess.running();
		chess.defineTatics();
		System.out.println("");
		
		
		System.out.println("Details of the Golf player");
		
		GolfPlayer golf = new GolfPlayer("Mike weir");
		golf.train();
		golf.compete();
		golf.running();
		golf.defineTatics();
		System.out.println("");
		
		

	}

}
