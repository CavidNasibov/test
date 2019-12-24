package employee;

public class Rectangle {

	private float length = 9.0f;
	private float width = 8.0f;
	
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public double getArea() {
		return  width*length;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength (float length) {
		this.length=length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width=width;
	}
	

	public Rectangle() {

	}

	public Rectangle(float length, float width) {
       
		this.length=length;
		this.width=width;
		
	} //Override
	 public String toString() {
		 return"Length of rectangle is:  " + this.length + "\n" +
	       "With of rectangle is : " + this.width +"\n" +
				 "Area is : " + getArea() +"\n"+"Perimeter is " + getPerimeter() ;
	 }//  "\n" is meaning go next line


	 
	 
	 
	 
	 
}
