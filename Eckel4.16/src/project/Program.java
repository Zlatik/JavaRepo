package project;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Random rand =  new Random();
		int numb = rand.nextInt(25-0);
		for(;i<25;i++) {
			
			
			
			int next = rand.nextInt(25-0);
			if(numb<next) {
				System.out.println(next + " bigger " + numb );
			}else if(numb==next) {
				System.out.println(numb+" equals "+next);
			}else {
				System.out.println(next + " smaller "+numb);
			}
			numb = next;
		}
	}

}
