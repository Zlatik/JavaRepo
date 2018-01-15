package project;

public class Frog extends Amphibian{
	public void swim() {
		System.out.println("Frog.swim()");
	}
	public void move() {
		System.out.println("Frog.move()");
	}
	public void eat() {
		System.out.println("Frog.eat()");
	}
	public void kill() {
		System.out.println("Frog.kill()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog red = new Frog();
		try {
			((Amphibian)red).eat();
			((Amphibian)red).swim();
			((Amphibian)red).move();
			((Amphibian)red).kill();
		}catch(ClassCastException ex) {
			ex.printStackTrace();
		}
	}

}
