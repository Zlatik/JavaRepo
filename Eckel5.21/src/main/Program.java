package main;

public class Program {
	public static void getCurrency(Currency cur) {
		switch(cur) {
		case USD:
			System.out.println("nice");
			break;
		case GRN:
			System.out.println("bad");
			break;
		case RUB:
			System.out.println("very bad");
			break;
		case GBN:
			System.out.println("very nice");
			break;
		case EUR:
			System.out.println("not bad");
		}
		
	}
	public static void main(String [] args) {
		for(Currency cur : Currency.values()) {
			System.out.printf("Currency %s %d ;",cur, cur.ordinal());
		}
		
		getCurrency(Currency.EUR);
	}
}


