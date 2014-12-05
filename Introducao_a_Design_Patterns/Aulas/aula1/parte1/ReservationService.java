package aula1.parte1;

public class ReservationService {

	MysqlConnection connection;
	
	public ReservationService() {
	 connection = new MysqlConnection();
	}
	
	public void createReservation(){
		connection.connect();
		System.out.println("Business logic over the creation of a reservation");
	}
}
