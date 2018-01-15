package project;

 class Cat {

	Cat(int i){
		System.out.println(i);
	}

}




public class Cats{
	Cat tom;
	Cat dan;
	{
	 tom = new Cat(1);
	 dan = new Cat(2);
	 System.out.println("was initialized");
	}
	Cats(){
		System.out.println("CATS");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		new Cats();
		System.out.println("meow");
	}
}