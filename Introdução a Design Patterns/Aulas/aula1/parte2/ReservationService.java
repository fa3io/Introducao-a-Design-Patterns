package aula1.parte2;

public class ReservationService {

	OracleConnection connection;
	
	public ReservationService() {
	 connection = new OracleConnection();
	}
	
	public void createReservation(){
		connection.connect();
		System.out.println("Business logic over the creation of a reservation");
	}
}
