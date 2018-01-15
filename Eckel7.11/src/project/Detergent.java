package project;


class Cleanser{
	protected String s;
	public void append(String a) {
		s = "Cleanser";
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}
}

public class Detergent {
	private Cleanser clean = new Cleanser();
	public void append(String a) {
		clean.s = "Detergent";
		clean.s += a;
	}
	public void dilute() {
		append(" dilute() ");
		
	}
	public void apply() {
		append(" apply() ");
	}
	public void scrub() {
		append(" scrub() ");
	}
	public String toString() {
		return clean.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent x = new Detergent();
		x.apply();
		System.out.println(x);
		x.dilute();
		System.out.println(x);
		x.scrub();
		System.out.println(x);
	}

}
