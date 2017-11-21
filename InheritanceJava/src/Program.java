import humanBeings.*;

public class Program {
	public static String whoIsOlder(int age1,int age2) {
		return (age1>age2)?"first person is older":"second person is older";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",18,"Smith");
		Worker David = new Worker("David",21,"Davidoff","programmer");
		Child Jinny = new Child("Jinny",3,"Young","Emili");
		
		System.out.println(John.gretting());
		System.out.println(David.greeting());
		System.out.println(Jinny.greeting());
		System.out.println(whoIsOlder(Jinny.getAge(),David.getAge()));
	}

}
