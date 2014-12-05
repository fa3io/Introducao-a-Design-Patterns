package aula3.parte5;

public class Version4Test {

	public static void main(String[] args) {
	
		System.out.println("Details of the tennis player");
		
		TennisPlayer tenista = new TennisPlayer("Gustavo Kuerten", new RunFast());
		tenista.train();
		tenista.compete();
		tenista.defineTatics();
		tenista.performedRunning();
		System.out.println("");
		
		
		System.out.println("Details of the soccer player");
		
		SoccerPlayer jogador = new SoccerPlayer("Ronaldinho Gaucho", new RunFast());
		jogador.train();
		jogador.compete();
		jogador.defineTatics();
		jogador.performedRunning();
		System.out.println("");
		
		
		System.out.println("Details of the Card player");
		
		CardPlayer card = new CardPlayer("Bob", new RunNoWay());
		card.train();
		card.compete();
		card.performedRunning();
		card.defineTatics();
		System.out.println("");
		
		
		System.out.println("Details of the Chess player");
		
		ChessPlayer chess = new ChessPlayer("Kasparov", new RunNoWay());
		chess.train();
		chess.compete();
		chess.performedRunning();
		chess.defineTatics();
		System.out.println("");
		
		
		System.out.println("Details of the Golf player");
		
		GolfPlayer golf = new GolfPlayer("Mike weir", new RunNoWay());
		golf.train();
		golf.compete();
		golf.performedRunning();
		golf.defineTatics();
		System.out.println("");
		
		
		
		System.out.println("Testing the runtime behevoir after change\n");
		
		jogador.setRunninBehavior(new RunNoWay());
		jogador.train();
		jogador.compete();
		jogador.defineTatics();
		jogador.performedRunning();
		System.out.println("");
		
		golf.setRunninBehavior(new RunFast());
		golf.train();
		golf.compete();
		golf.performedRunning();
		golf.defineTatics();
		System.out.println("");
		
		
		
		
		
		
		
		
		

	}

}
