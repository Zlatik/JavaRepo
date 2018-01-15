package main.folder;

public class Human {
	private String name;
	private String lastname;
	private int age;
	public Human(String Name) {
		name = Name;
	};
	public Human(String Name,String Lastname) {
		this(Name);
		lastname = Lastname;
	};
	public Human(String Name,String Lastname,int Age) {
		this(Name,Lastname);
		age = Age;
	};
	public String getName() {
		return name;
	};
	public String getLastname() {
		return lastname;
	};
	public int getAge() {
		return age;
	};
	public void setName(String val) {
		name = val;
	};
	public void setLastname(String val) {
		lastname = val;
	};
	public void setAge(int val) {
		age = val;
	};
	public void sayHi() {
		 System.out.printf("Hi my name is %s %s and i'm %d years old", name,lastname,age);
	}

}
