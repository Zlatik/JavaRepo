package main;

public class Car {
	private int speed;
	private String brand;
	private String model;
	
	
	public Car(){
		speed = 0;
		brand = "default brand";
		model = "dafault model";
	}
	
	public Car(int Speed , String Brand ,String Model){
		speed = Speed;
		brand = Brand;
		model = Model;
	}
	
	public int getSpeed() {
		return speed;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	
	public void setSpeed(int val) {
		speed = val;
	}
	
	public void setBrand(String val) {
		brand = val;
	}
	
	public void setModel(String val) {
		model = val;
	}
	
	public void setSpeed(int val,String unit) {
		System.out.format("this car's speed is : %d %s", val , unit);
	}
	public String toString() {
		return String.format("%s %s %d", brand,model,speed);
	}
}
