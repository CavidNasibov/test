package abstractionNTU1;

public class rectangle1 extends Shape1 {

	
	
	protected double width;
	protected double lenght;
	public rectangle1() {
		
	}
	
public rectangle1( double width,double lenght) {
	this.width=width;
	this.lenght=lenght;
		
	}
public rectangle1( double width,double lenght,String color,boolean filled) {
	
	super(color,filled); 
	this.width=width;
	this.lenght=lenght;
		
	}
	
	
	
	public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public double getLenght() {
	return lenght;
}

public void setLenght(double lenght) {
	this.lenght = lenght;
}

	@Override
	public double getArea() {
		
		return lenght*width;
	

}

	@Override
	public double getPerrimeter() {
		
		return 2*(lenght+width);
	}

	@Override
	public String toString() {
		
		return "Area of the rectangle is : " + getArea()+ "\n" +  "Area of the rectangle is : " + getPerrimeter();
	}
}