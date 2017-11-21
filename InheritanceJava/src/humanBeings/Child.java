package humanBeings;

public class Child extends Person{
	private String mathersName;
	public Child(String firstname,int age,String lastname,String mathersName) {
		super(firstname,age,lastname);
		this.mathersName = mathersName;
		
	}
	
	public String getMathersName() {
		return this.mathersName;
	}
	
	public void setMathersName(String val) {
		this.mathersName = val;
	}
	
	public String greeting() {
		return ("Hello my name is "+this.getFirstname()+" i am "+this.getAge()+"."+"My mammy name is "+ this.mathersName);
	}
	

}
