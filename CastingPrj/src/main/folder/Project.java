package main.folder;
import java.util.ArrayList;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Human> humanList= new ArrayList<Human>();
		humanList.add(new Human("Svyat","Zlatous",21));
		humanList.add(new Human("Yulia"));
		if(humanList.get(0) instanceof Child) {
			System.out.println(((Child)humanList.get(0)).play());
		};
		if(humanList.get(0) instanceof Child) {
			((Child)humanList.get(0)).sayHi();
		};
		System.out.println(humanList.get(0).getName());
		humanList.get(0).sayHi();
		
		
	}

}
