package javabasic;

import java.util.Scanner;

public class FlowControl {
  public static void main(String[] args) {
	
	  //Escape control
//	  System.out.println("Jhon said \"Hey\"");
//	  
//	  System.out.println("My height is 5' 10 \"");//w.t.f.we use when between the equotes want to write somthing..but java doesnt
//	  System.out.println('\'');
//	                                             //to use this sign or charachter.You just have to put back slahsh\ before 
//	                                               //that sign.and it called escaped
//	  System.out.println("Hello \nfff \nWorld");//if you want output will be hello first and world under ,just  put \n between
//	  
	  
//	  
//	boolean flag = false;
//	System.out.println(flag);//If you using compare to two objects ,it is mean you use boolean//
//	System.out.println(10>9);
//	System.out.println(10<9);
//	System.out.println(10==9);
	  
//	boolean isRaining = false;
//	     if(isRaining==true) {
//	    	 System.out.println("Take umbrella");
//	     }
//	     else {
//	    	 System.out.println("Dont take umbrella");
//	     }
//	
	
	
	
	Scanner in=new Scanner(System.in);
//	System.out.println("How is the weather");
//	String weatherCondition=in.nextLine();
//	if(weatherCondition.equals("snowing")) {
//		System.out.println("It is snowing");
//	}
//	else if(weatherCondition.equals("rainy")) {
//		System.out.println("It is raining");
//	}
//	
//	else if(weatherCondition.equals("sunny")) {
//		System.out.println("It is a great day");
//		
//		}
//	else {
//		System.out.println("Stay at home");
//	}
//		
		
		System.out.println("Please enter your grade");
		
		double grade=in.nextDouble();
		System.out.println(grade);
		if(grade >=97) {
		System.out.println("A+");
		}	
		else if(grade<97 && grade >=92) {
			System.out.println("A+");
		}
		else if(grade<97 && grade >=89) {
			System.out.println("A");
		}
		else 
		   System.out.println("I dont remember the rest");           {
			
			int num=50;
			   System.out.println(41>num && num<58);     // && double ampersand likes false,if one condition is false output is false
               //just one condition otput is true true&&Atrue
//     System.out.println(true && true);//output true    //you can use one & ampersand,but output will be same result,
//     System.out.println(false && true);//output false   //whats the matter,with & Java will look both conditions,if you put
                       //two && ampersand if its false its doesnt check second.With two && we 
//   System.out.println(false && false);//output false   //just  save the time  .
//    System.out.println(true && false);//output false


//System.out.println(true || true);output true      // || or or likes true ,if one condition is true output is true,jus tone 
//System.out.println(false  || true);output true    // one condition is false false || false output false
//System.out.println(true   || false);output true   //* using or|| if one condition is true answer is true
//System.out.println(false  || false);output false   //* using and&& if one condition is false answer is false
			   
//			   System.out.println("Enter your age");
//		       int age=in.nextInt();
//		       if (age >=18) {
//				System.out.println("You can vote");
//			} else {
//	           System.out.println("Not eligible");
//			} 
			   System.out.println("Put your number");
//	          int length= str.nextInt();
//	          int breadth=str.nextInt();
//	          
//	          if (length==breadth) {
//				System.out.println("It is square");
//			} else {
//	        System.out.println("It is rectangle");
//			}
			   
			//   int ch= 'a';
              // System.out.println(ch);//with this function we can realize what is letter we looking equivalent number 
               //on the ASCII table
		}
		}
		
		
		
		
			
}

