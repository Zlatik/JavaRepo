package reusing;

class Inspect{
	private int i = 9;
	protected int j;
	Inspect(){
		System.out.println("i = " + i + " j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static field Inspect.x1 has been initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Inspect{
	private int k = printInit("Field Beetle.k has been initialized");
	public Beetle(){
		System.out.println("k = "+k);
		System.out.println("j = "+j);
	}
	private static int x2 = printInit("static field Beetle.x2 has been initialized");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructor Ant()");
		new Ant();
	}

}
class Ant extends Beetle{
	private int k;
	public Ant() {
		k = 56;
		System.out.println("k = " + k);
	}
	private static int x2 = printInit("static field Ant.x2 has been initialized");
}