package aula1.parte2;

public class RoomService {

	private OracleConnection connection;
	
	public RoomService() {
		connection = new OracleConnection();
	}
	
	public void roomVerification(){
		connection.connect();
		System.out.println("Business logic over entity room");
	}
}
