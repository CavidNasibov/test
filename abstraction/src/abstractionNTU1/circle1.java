package abstractionNTU1;

public class circle1 extends Shape1 {
	
	protected double radius;
	
   public circle1() {
	   
   }
   public circle1(double radius) {
	   this.radius=radius;
   }
   public circle1(double radius,String color,boolean filled) {
	   super(color,filled);
	   this.radius=radius;
	   
   }

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
		
	}

	@Override
	public double getPerrimeter() {
		
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		
		return "Area of circle is: " + getArea() +"\n" + "Perrimeter of circle is: " + getPerrimeter();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}

}
