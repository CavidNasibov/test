package intheritance_day1;

public class TestCylinder {
public static void main(String[] args) {
	//create insatnce of cylinder class 
	//initilazed radius
	//print radius
	//Cylinder cl1=new Cylinder();
//	cl1.setRadius(7.5);
//	System.out.println(cl1.getRadius());
//	System.out.println(cl1.toString());
//	
//	Cylinder cl2=new Cylinder(8.9);
//	System.out.println(cl2.toString());
	
	//Cylinder cl3=new Cylinder(4.0,"red");
	//System.out.println(cl3.toString());
	//cl3.setHeight(2);
	
	//System.out.println(cl3.getVolume());
	//System.out.printf("%.2f" ,cl3.getVolume());
	
	//Tesd Drivven Development TDD
	Cylinder cl4=new Cylinder(9.0,"Green",6);
	System.out.println(cl4.toString());
	System.out.println(cl4.getVolume());
	//
}
}
