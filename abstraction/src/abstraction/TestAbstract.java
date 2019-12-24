package abstraction;

import abstractionNTU1.Shape1;
import abstractionNTU1.circle1;
import abstractionNTU1.rectangle1;
import abstractionNTU1.square1;

public class TestAbstract {
public static void main(String[] args) {
	Shape circle1=new Circle(5.1);
	
	circle1.getArea();
//	System.out.println(circle1.toString());
	Shape rectangle=new rectangle(5,2);
	rectangle.getArea();
//	System.out.println(rectangle.toString());
	square sq=new square(7);
//	System.out.println(sq.getArea());
//	System.out.println(sq.toString());
	circle1 cr1=new circle1(5.0);

	circle1 sh=new circle1();
	sh.getArea();
}
}
