package project;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car ferrari =  new Car();
		System.out.printf("brand:%s,model:%s.\n",ferrari.brand,ferrari.model);
		ferrari.model = "F50";
		System.out.println(ferrari.model);
	}

}
