package project;

import java.util.Random;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rand =  new Random();
		int numb = rand.nextInt(25-0);
		while(System.in.available() == 0) {
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
