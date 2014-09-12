package aula1.parte3;

public class MysqlConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connecting to My SQL");
	}
}
