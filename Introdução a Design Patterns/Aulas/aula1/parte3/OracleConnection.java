package aula1.parte3;

public class OracleConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle");
	}
}
