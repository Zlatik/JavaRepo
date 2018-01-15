package project;

public class A {
	A(){
		System.out.println("A()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new C();
		
	}

}

class B{
	B(){
		System.out.println("B()");
	}
}

class C extends A {
	B b = new B();
}