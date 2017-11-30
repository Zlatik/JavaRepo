package project;

public class Program {
	public static int storage(String s) {
		return s.length()*2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi my name is svyatik";
		System.out.println(String.format("%d bytes",storage(str)));
	}

}
