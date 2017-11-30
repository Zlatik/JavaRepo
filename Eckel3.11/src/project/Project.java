package project;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0x01000000;
		while(first>0x00000001) {
			System.out.println(first>>=1);
		}

	}

}
