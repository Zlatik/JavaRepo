package humanBeings;

public class Worker extends Person {
	private String profession;
	
	
	public Worker(String firstname,int age,String lastname,String profession) {
		super(firstname,age,lastname);
		this.profession = profession;
	};
	public void setProfession(String val) {
		this.profession = val;
	};
	public String getProfession() {
		return this.profession;
	}
	
	public String greeting() {
		return ("Hi,my name is "+this.getFirstname()+" "+this.getLastname()+"."+"I am "+this.getAge()+" and work as "+this.profession );
	}

}
