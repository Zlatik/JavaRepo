package humanBeings;

public class Person {
	private String firstname;
	private int age;
	private String lastname;
	
	
	public Person(String firstname,int age,String lastname){
		this.firstname = firstname;
		this.age = age;
		this.lastname = lastname;
		
	};
	
	public void setAge(int val) {
		this.age = val;
	};
	
	public int getAge() {
		return this.age;
	};
	
	public void setFirstname(String val) {
		this.firstname = val;
	};
	
	public String getFirstname() {
		return this.firstname;
	};
	
	public void setLastname(String val) {
		this.lastname = val;
	};
	
	public String getLastname() {
		return this.lastname;
	};
	
	
	public String gretting() {
		return ("hi,i am "+this.firstname+" "+this.lastname+" i am "+this.age);
	}

}
