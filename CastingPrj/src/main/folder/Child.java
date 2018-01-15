package main.folder;

public class Child extends Human{
	public Child(String Name) {
		super(Name);
	};
	public Child(String Name,String Lastname) {
		super(Name,Lastname);
	};
	public Child(String Name,String Lastname,int Age) {
		super(Name,Lastname,Age);
	};
	public String getName() {
		return super.getName();
	}
	public String play() {
		return String.format("hi i am %s and i'm playing smtn",getName() );
	}
	public void sayHi() {
		 super.sayHi();
	}

}
