package intheritance_day1;

public class Circle {
	// Create two instance variables
	// both private
	// radius -> double
	// color -> String

	private double radius;
	private String color;
	
	public Circle() {
		
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;

	}
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}

	public Circle(double radius ,String color) {
		this.radius=radius;
		this.color=color;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public String toString() {
		return "Circle[radius=" + radius + ",color="
				+color + "]" ;
	}
	
	
	
}
