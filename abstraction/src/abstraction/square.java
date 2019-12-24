package abstraction;

public class square extends rectangle {

	public square (double side) {
		super(side,side);
	}
public String toString() {
		
		return "Area of square is: " + getArea() ;
}
}
