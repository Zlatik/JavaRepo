package project;
import java.util.ArrayList;
public class ConnectionManager {
	public final int length = 5;

	public static ArrayList <Connection> connectionList = new ArrayList <Connection>();
	public static void deleteConnection(int con) {
		try {
			connectionList.remove(con);
			if(connectionList.toArray().length == 0) {
				throw new Exception("Array is null now");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	};
	public static void addConnection() {
		if(connectionList.toArray().length < 5) {
			connectionList.add(Connection.createConnection());
		}else {
			 throw new IndexOutOfBoundsException("Maximal number of ArrayList is 5");
		}
	}
	

}
class Connection{
	public static int count = 0;
	private Connection() {
		count++;
	};
	public static Connection createConnection() {
		return new Connection();
	};
	public String toString() {
		return String.format("Connection %d", count);
	}
	
}
