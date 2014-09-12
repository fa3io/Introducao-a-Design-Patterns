package aula1.parte1;

public class TesteConnection {

	public static void main(String[] args) {
		
		RoomService room = new RoomService();
		room.roomVerification();
		
		ReservationReport report = new ReservationReport();
		report.reportGeneration();
		
		ReservationService service = new ReservationService();
		service.createReservation();
	}
}
