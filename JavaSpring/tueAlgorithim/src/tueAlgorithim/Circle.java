package tueAlgorithim;
import java.lang.Math;
public class Circle extends GeomitrecObject {
	private double radius;

	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double r= radius/2;
		return 3.14*Math.pow(r,2);
	}
	public double getPerimeter() {
		return 2*3.14*radius;
		
	}
	public double getDiameter() {
		return 2*radius;
		
	}
	public void printCircle() {
		
	}

}
