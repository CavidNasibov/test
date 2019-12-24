package abstractionNTU1;

public class square1 extends rectangle1 {

	public square1() {

	}

	public square1(double side) {
		super(side, side);
	//	this.lenght=side;  //we have to ways use length and width ,with this way and super
		//this.width=side;
	}

	public square1(double side, String color, boolean filled) {

	super(side,side,color,filled);
	}

	public double getSide() {
		return getSide();
	}

	public void setSide(double side) {
		this.width = side;
	}

	public void setWidth(double side) {
		this.width = side;
	}

	public void setLenght(double side) {
		this.lenght = side;
	}

	public String toString() {
		return "Area of the Square is : " + getArea() + "\n" + "Perrimeter of the Square is : " + getPerrimeter();
	}

}
