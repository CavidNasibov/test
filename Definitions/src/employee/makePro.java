package employee;

import java.util.Arrays;
import java.util.Scanner;




//
public class makePro {
	public  String name;
	public static int weight;
	public static int length;
public static void main(String[] args) {    //after creating programe you can use that pro inside of main method's brace.
makePro t=new makePro();      //.   <- <- Using pro u must create new claas and call with point.
Scanner sc=new Scanner (System.in);
t.name=sc.next();
length=sc.nextInt();
weight=sc.nextInt();
System.out.println(t.in(weight, length));

   }                                             //                                                                      <-     <-
public  void str(String name) {           // if you want to create program:you must create "public" outside of "main" method's braces,
	System.out.println(name);             //  With 'void'pro you can just print somthing
	
		}                                                                              //<-  <-
public int in(int weight,int length) { //if you want create one more pro you must create outside of other programms again.
	return weight + length;
}

//*******************************************************************************************************************************************

		
			 
				
	
	
	}
	
		


