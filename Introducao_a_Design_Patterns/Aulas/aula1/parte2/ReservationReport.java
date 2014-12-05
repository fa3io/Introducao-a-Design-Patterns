package aula1.parte2;

public class ReservationReport {
	
	private OracleConnection connection;
	
	public ReservationReport() {
		connection= new OracleConnection();
	}
	
	public void reportGeneration(){
		connection.connect();
		System.out.println("Businees logic in order to generate a report");
	}

}
