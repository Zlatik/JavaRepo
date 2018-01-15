package project;

public class Human {
	Human(){
		System.out.println("Human()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Employee();
	}

}
class Adult extends Human{
	Adult(){
		System.out.println("Adult()");
	}
}

class Employee extends Adult{
	Employee(){
		System.out.println("Employee()");
	}
}