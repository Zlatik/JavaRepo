package project;

public class Animal {
	Animal(){
		System.out.println("Animal()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Kitty();
	}

}
class Kitty extends Animal{
	Kitty(){
		System.out.println("Kitty()");
	}
}
