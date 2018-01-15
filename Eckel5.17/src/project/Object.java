package project;

public class Object {
	Object(String what){
		System.out.println(what);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] obj = new Object[5];
		for(Object j:obj) {
			System.out.println(j);
		}
	
		for(Object i:obj) {
			i = new Object("Cat"+ " "+(int) (Math.random()*6));
			System.out.println(i);
		}
	}
	
	

}
