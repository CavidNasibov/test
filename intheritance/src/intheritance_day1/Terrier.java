package intheritance_day1;

import intheritancePoint.Dog;

public class Terrier extends Dog {

	
	//Animal -> Dog ->Terrier
	
	public static void main(String[] args) {
		Terrier tr=new Terrier();
		tr.move();
		tr.dogSound();
	}
	
}
