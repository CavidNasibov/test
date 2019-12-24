package interfaces;

import interfacesDefinition.bmw;
import interfacesDefinition.mercedes;

public class testCars {
public static void main(String[] args) {
	
	
	bmw b=new bmw();
	mercedes m=new mercedes();
	b.stop();
	m.stop();
	b.drive(200);
	m.drive(100);
	b.park();
	m.park();
	b.ch();
	
}
	
	
	
}
