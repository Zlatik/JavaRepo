package project;

public class Root {
	public Component1 one;
	public Component2 two;
	public Component3 three;
	Root(){
		one = new Component1();
		two = new Component2();
		three = new Component3();
		System.out.println("Root()");
		
	}
	public void dispose()  {
		try {
			Component1.dispose(one);
			Component2.dispose(two);
			Component3.dispose(three);
			System.out.println("Root.dispose()");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
class Component1{
	public Component1(){
		System.out.println("Component1()");
	}
	public static void dispose(Object one) throws Exception{
		if(one instanceof Component1) {
			System.out.println("Component1.dispose()");
			one = null;
		}else {
			throw new Exception("wrong type");
		}
	}
}
class Component2{
	public Component2(){
		System.out.println("Component2()");
	}
	public static void dispose(Object two) throws Exception{
		if(two instanceof Component2) {
			System.out.println("Component2.dispose()");
			two = null;
		}else {
			throw new Exception("wrong type");
		}
	}
}
class Component3{
	public Component3(){
		System.out.println("Component3()");
	}
	public static void dispose(Object three) throws Exception{
		if(three instanceof Component3) {
			System.out.println("Component3.dispose()");
			three = null;
		}else {
			throw new Exception("wrong type");
		}
	}
}