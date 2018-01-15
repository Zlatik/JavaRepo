package classes;

public class Difficult {
	Simple s;
	private int first;
	private int second;
	{
		first = 3;
		second = 4;
	}
	public String toString() {
		s = new Simple(first,second);
		return String.format("%d and %d", first,second);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Difficult dif = new Difficult();
		System.out.println(dif);
	}

}
