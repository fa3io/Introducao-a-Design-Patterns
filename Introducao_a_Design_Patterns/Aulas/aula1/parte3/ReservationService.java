package aula1.parte3;

public class ReservationService {

	Connection connection;
	
	public ReservationService(Connection connection) {
	 this.connection = connection;
	}
	
	public void createReservation(){
		connection.connect();
		System.out.println("Business logic over the creation of a reservation");
	}
}
