package project;

public class Root {
	Component1 one;
	Component2 two;
	Component3 three;
	Root(){
		one = new Component1();
		two = new Component2();
		three = new Component3();
		
	}
}
class Component1{
	Component1(){
		System.out.println("Component1()");
	}
}
class Component2{
	Component2(){
		System.out.println("Component2()");
	}
}
class Component3{
	Component3(){
		System.out.println("Component3()");
	}
}