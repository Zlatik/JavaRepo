package project;

public class Program {
	public static  String comparer(String str1,String str2) {
		return (str1.compareTo(str2)==1)?"first is bigger":(str1.equals(str2))?"they are equal":"second is bigger";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(comparer("first","second"));
	}

}
