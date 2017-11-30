package project;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int first = 0x0000001;
		final int second = 0x1000000;
		
		System.out.printf("first & second:%s;first | second:%s;first ^ second:%s;not first:%s;not second:%s.", Integer.toBinaryString(second & first),Integer.toBinaryString(first | second),Integer.toBinaryString(first ^ second),Integer.toBinaryString(~first),Integer.toBinaryString(~second));
	}

}
