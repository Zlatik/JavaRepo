package project;

public class A {	
	A(int i){
		System.out.printf("A(%d)",i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C(5);
	}

}

class B{
	B(int i){
		System.out.printf("B(%d)",i);
	}
}

class C extends A{
	
	C(int i){
		
		super(i);
		new B(i);
		System.out.printf("C(%d)",i);
	}
}
