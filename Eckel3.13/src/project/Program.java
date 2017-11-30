package project;

public class Program {
	public static String charToBinary(char str) {
		Character temp = str;
		int number = temp.hashCode();
		return Integer.toBinaryString(number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(charToBinary('d'));
		System.out.println(charToBinary('z'));
		System.out.println(charToBinary('*'));

	}

}
