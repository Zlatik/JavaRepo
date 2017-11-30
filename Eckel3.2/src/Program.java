import implementation.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ferrari = new Car();
		Car mazda = new Car();
		ferrari.fuel = 67.1;
		mazda = ferrari;
		System.out.println(mazda.fuel);
		mazda.fuel = 27.3;
		System.out.println(mazda.fuel);
	}

}
