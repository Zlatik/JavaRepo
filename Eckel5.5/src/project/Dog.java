package project;

public class Dog {
	Dog(char bark){
		System.out.println(String.format("i am barking %s", bark));
	}
	
	Dog(int howl){
		System.out.println(String.format("i am howling %s times", howl));
	}
	Dog(boolean flag){
		System.out.println(String.format("Am i good boy?%b", flag));
	}

}
