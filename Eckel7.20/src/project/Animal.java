package project;

public class Animal {
	public final void hi() {
		System.out.println("i am animal");
	}
	public void age(int age) {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tigres = new Tiger();
		tigres.hi();
		tigres.age(6);
	}

}
class Tiger extends Animal{
		@Override
		public void age(int age) {
			System.out.println(age+" years old");
		}
		
}
