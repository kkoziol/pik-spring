package pl.pik.kk.przyklady.spring.p11;

public class Connection {

	String connectionString;

	public Connection(String connectionString) {
		super();
		this.connectionString = connectionString;
	}

	@Override
	public String toString() {
		return "Connection [connectionString=" + connectionString + "]";
	}
	

}
