package aula1.parte3;

public class ReservationReport {
	
	private Connection connection;
	
	public ReservationReport(Connection connection) {
		this.connection = connection;
	}
	
	public void reportGeneration(){
		connection.connect();
		System.out.println("Businees logic in order to generate a report");
	}

}
