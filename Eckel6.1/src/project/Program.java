package project;
import main.*;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Car ferrari = new Car(scn.nextInt(),scn.next(),scn.next());
		scn.close();
		System.out.println(ferrari);
	}

}
