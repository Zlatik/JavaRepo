package reusing;
import static java.lang.System.out;
class Cleanser{
	public String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute(){
		append(".dilute()");
	}
	public void apply() {
		append(".apply()");
	}
	public void scrub() {
		append(".scrub()");
	}
	public String toString() {
		return s;
	}

}
public class Detergent extends Cleanser {
    
	public void scrub() {
		 s = "Detergent";
		super.scrub();
	}
	public void foam() {
		append(" foam");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent x = new Detergent();
		x.scrub();
		x.foam();
		out.println(x);
		//out.print(x.scrub());
		
		Sterilizer st = new Sterilizer();
		st.scrub();
		st.sterilize();
		out.println(st);
	}

}
class Sterilizer extends Detergent{
	 
	public void scrub() {
		s = "Sterilizer";
		append(".scrub");
		
	}
	public void sterilize() {
		append(" sterilize()");
	}
}
