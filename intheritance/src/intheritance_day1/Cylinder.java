package intheritance_day1;

import intheritance_day1.Circle;

public class Cylinder extends Circle {
	
	private double height=1;

	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius,String color) {	
		super(radius,color);
	}
	public Cylinder(double radius,String color,double height) {
		super(radius,color);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getVolume() {
		//2*pi*r^2*h
		//2*A*h
		return  getArea() *this.height;
	}
	public String toString() {
		return "Cylinder[radius" + getRadius() + 
		",color=" + getColor() + ",height="	+
				this.height +"]";
	}
	}

