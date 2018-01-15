package project;

public class Tank {
	private static int capacity;
	
	public static int makeEmpty() {
		return capacity = 0;
	};
	
	public static int makeFull() {
		return capacity = 100;
	};
	
	public void finalize() {
		makeEmpty();
		System.out.println(capacity);
	}

}
