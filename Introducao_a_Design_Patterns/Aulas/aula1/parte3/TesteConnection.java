package aula1.parte3;

public class TesteConnection {

	public static void main(String[] args) {
	
		
		RoomService room = new RoomService(new SqlServerConnection());
		room.roomVerification();
		
		ReservationReport report = new ReservationReport(new OracleConnection());
		report.reportGeneration();
		
		ReservationService service = new ReservationService(new MysqlConnection());
		service.createReservation();
	}
}
