package abstraction;

public class rectangle extends Shape {

	public double length;
	public double width;
	
	public rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double getArea() {
		
		return length*width;
	}

	@Override
	public String toString() {
		
		return "Rectangle of area is: "+ getArea() ;
	}

	
}
