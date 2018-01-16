package reusing;

public class Cycle {
	public void ride() {
		System.out.println("Cycle.ride()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle [] c = {new Unicycle(),new Bicycle(),new Tricycle()};
		for(Cycle cycle:c) {
			cycle.ride();
		}
	}

}
class Unicycle extends Cycle{
	public void ride() {
		System.out.println("Unicycle.ride()");
	}
}
class Bicycle extends Cycle{
	public void ride() {
		System.out.println("Bicycle.ride()");
	}
}
class Tricycle extends Cycle{
	public void ride() {
		System.out.println("Tricycle.ride()");
	}
}