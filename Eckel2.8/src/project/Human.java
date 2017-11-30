package project;

public class Human {
	private String firstName;
	private String surName;
	
	public static int life = 100;
	
	public Human() {
		firstName = "somebody";
		surName = "else";
	}
	
	public void setFirstName(String val) {
		firstName = val;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setSurName(String val) {
		surName = val;
	}
	public String getSurName() {
		return surName;
	}

}
