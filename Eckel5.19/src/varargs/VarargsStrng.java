package varargs;

public class VarargsStrng {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vargsArr("Hii","my","name","is","svyat");
		vargsArr(new String[] {"hi","my","name","is","Yulia"});
	}
	public static void vargsArr(String... a) {
		for(String i : a) {
			System.out.println(i);
		}
		
	}
}
