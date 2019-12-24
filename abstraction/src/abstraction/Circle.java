package abstraction;

public class Circle extends Shape {

	public double radius;

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
		
		
	}
	public String toString(){
		return "Area of circle is: " + getArea();	
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	

}
