package project;

public class Person {
	int age;
	String name;
	Person(int Age,String Name){
		age = Age;
		name = Name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Adult().age);
	}

}
class Adult extends Person{
	Adult(int Age,String Name){
		super(Age,Name);
	}
	Adult(){
	  super(0,"unknown");
	}
	
}