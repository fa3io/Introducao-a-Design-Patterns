package aula1.parte3;

public class RoomService {

	private Connection connection;
	
	public RoomService(Connection connection) {
		this.connection = connection;
	}
	
	public void roomVerification(){
		connection.connect();
		System.out.println("Business logic over entity room");
	}
}
