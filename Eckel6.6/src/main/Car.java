package main;

public class Car {
	protected int speed;
	protected int price;
}
class SportCar extends Car{
	public void setValues(int val,int Price) {
		speed = val;
		price = Price;
		
	}
}
