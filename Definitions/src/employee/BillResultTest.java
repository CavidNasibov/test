package employee;

import java.util.Scanner;

public class BillResultTest {
	//rate=150 hour=1 min=45 
	//150*1+150/(45/15)
	
	public static final int RATE= 150;
	public int hours;
	public int minutes;
public static void main(String[] args) {
	BillResultTest john=new BillResultTest ();
	john.timeWorked();
	double Bill=RATE * john.hours + (john.minutes/15*37.5);
	System.out.println(Bill);
}
public void timeWorked() {
	System.out.println("Enter ful hours worked");
	System.out.println("Enter minutes worked");
	Scanner in=new Scanner(System.in);
	 hours=in.nextInt();
	 minutes=in.nextInt();
	
}
}
