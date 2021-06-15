package tueAlgorithim;

import java.util.Date;

public class Rectangle extends GeomitrecObject {
	private double width ;
	private double height ;
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		
	}
	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.width*this.height;
	}
	public double getPerimeter() {
		return 2*(height+width);
	}
}
