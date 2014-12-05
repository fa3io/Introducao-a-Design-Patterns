package aula1.parte1;

public class RoomService {

	private MysqlConnection connection;
	
	public RoomService() {
		connection = new MysqlConnection();
	}
	
	public void roomVerification(){
		connection.connect();
		System.out.println("Business logic over entity room");
	}
}
