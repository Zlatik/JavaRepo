package project;

class Engine{
	int miliage;
	Engine(int val){
		miliage = val;
	}
	public String toString() {
		return "new engine";
	}
	
}
public class Car {
	private final int speed;
	private final String model;
	private final Engine engine;
	Car(){
		speed = 100;
		model = "LX100";
		engine = new Engine(10000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car lexus = new Car();
		System.out.println(lexus.model+" "+lexus.speed+" "+lexus.engine+" "+lexus.engine.miliage);
		

	}

}
