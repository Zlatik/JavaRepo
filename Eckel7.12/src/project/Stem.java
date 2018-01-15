package project;

public class Stem extends Root{
	Stem(){
		super();
		System.out.println("Stem()");
	}
	public void dispose() {
		try {
			super.dispose();
			System.out.println("Stem.dispose()");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem t = new Stem();
		t.dispose();
	}

}
