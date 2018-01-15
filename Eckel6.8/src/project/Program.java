package project;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionManager.addConnection();
		ConnectionManager.addConnection();
		ConnectionManager.addConnection();
		ConnectionManager.addConnection();
		System.out.println(ConnectionManager.connectionList.get(3));
		ConnectionManager.deleteConnection(1);
		
	}

}
