package implementation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog();
		Dog scuffy = new Dog();
		spot.name = "spot";
		scuffy.name = "scuffy";
		
		spot.says = "i am good dog";
		scuffy.says = "i am bad boy";
		
		Dog tom = new Dog();
		spot = tom;
		System.out.println(spot==tom);
		System.out.println(spot.equals(tom));
		
		System.out.println(tom.says);
		System.out.println(spot.says);
	}

}
