package aula1.parte1;

public class ReservationReport {
	
	private MysqlConnection connection;
	
	public ReservationReport() {
		connection= new MysqlConnection();
	}
	
	public void reportGeneration(){
		connection.connect();
		System.out.println("Businees logic in order to generate a report");
	}

}
