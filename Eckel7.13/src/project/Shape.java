package project;

public class Shape {
	public void draw(String figure) {
		System.out.printf(" %s()",figure);
	}
	public void draw(int x,int y) {
		System.out.printf(" Coords:%d,%d",x,y);
	}
	public void draw(int square) {
		System.out.printf(" Square:%d",square);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.draw(45);
		rect.draw("rectangle");
		rect.draw(5,9);
		rect.draw(5, 9, 45);
	}

}
class Rectangle extends Shape{
	public void draw(int x, int y,int square) {
		System.out.printf(" Coords:%d,%d Square:%d",x,y,square);
	}
}
