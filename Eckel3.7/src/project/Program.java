package project;
import java.util.Random;
public class Program {
	public static String coinFlipper() {
		Random r = new Random();
		return (r.nextInt(25-0)%2==0)?"heads":"tails";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
		System.out.println(coinFlipper());
	}

}
