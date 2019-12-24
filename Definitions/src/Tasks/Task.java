package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
	

	public static void main(String[] args) {
//		Scanner earth = new Scanner(System.in);
//		// Task1
////		Scanner input=new Scanner (System.in);
////		System.out.println("First number is:");
////		int peace = input.nextInt();
////		System.out.println("Second number is:");
////		int full = input.nextInt();
////        System.out.println(peace + " - " + full + " = " + (peace - full));
////		
////		//Task2
////		Scanner input=new Scanner (System.in);
////		System.out.println("First number is:");
////		int peace = input.nextInt();
////		System.out.println("Second number is:");
////		int full = input.nextInt();
////        System.out.println(peace + " / " + full + " = " + (peace / full));
//		// Task 1
////		System.out.print("Hello ");
////		System.out.print("Nasibov Javid");
//
//		// Task 2
////		int planet = 74;
////		int star = 36 ;
////		System.out.println(planet +star);
//
//		// Task3
////		int some = 50;
////		int any = 3;
////		int fewer =some / any ;
////		System.out.println(fewer);
////		
//		// Task4
////		int earth = -5;
////	    int mars = 8;
////	    int venus =6;
////	    System.out.println(earth+mars*venus);
////	   
////	    
////	   byte jupiter = 55;
////	   byte saturn = 9;
////	   System.out.println((jupiter + saturn)%saturn);
////	   
////	   
////	   short mercury = 20;
////	   short moon = -3;
////	   short neptun = 5;
////	   System.out.println(mercury + moon*neptun/mars);
////	   
////	   long sun = 15;
////	   long pluto = 2;
////	   long uranus = 3;
////	   System.out.println(neptun + sun/uranus * pluto - mars % uranus);
//
//		// Task5
//
////	Scanner input=new Scanner (System.in);
////		System.out.println("First number is:");
////		int peace = input.nextInt();
////		System.out.println("Second number is:");
////		int full = input.nextInt();
////        System.out.println(peace + " * " + full + " = " + (peace * full));
//
//		// Task6
//
////		Scanner input=new Scanner (System.in);
////		System.out.println("First number is:");
////		int peace = input.nextInt();
////		System.out.println("Second number is:");
////		int full = input.nextInt();
////        System.out.println(peace + " + " + full + " = " + (peace + full));
////		System.out.println(peace + " * " + full + " = " + (peace - full));
////		System.out.println(peace + " * " + full + " = " + (peace * full));
////		System.out.println(peace + " / " + full + " = " + (peace / full));
////		System.out.println(peace + " % " + full + " = " + (peace % full));
//
////        
//
//		// Task7
////	int moon = earth.nextInt();	
////	int i = 1;	
////    int h = 1;
////	System.out.println(moon + " * " + i++ + " = " + moon* h++);
////	System.out.println(moon + " * " + i++ + " = " + moon* h++);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
////	System.out.println(moon + " * " + ++i + " = " + moon* ++h);
//
//		// Task8
//
////		String J="J";
////	String a ="a";
////	String v="v";
////	
////		System.out.println(  "  J          a              v      v            a  " );
////		System.out.println( "   J        a   a             v    v           a   a ");
////		System.out.println( "J  J       a  a  a             v  v           a  a   a ");
////		System.out.println("   JJ      a       a              v           a        a ");
//
//		// Task9
////		double a = 25.5;
////		double b = 3.5;
////		double c = 40.5;
////		double d = 4.5;
////		System.out.println((a*b-b*b)/(c-d));
//
//		// Task10
////		double a =4.0;
////		int b =1;
////		double c =1.0;
////		int d =3;
////		int e =5;
////		int f =7;
////		int g =9;
////		int h =11;
////		System.out.println(a*(b-(c/d)+(c/e)-(c/f)+(c/9)-(c/11)));
//
//		// Task10
////		double p=3.14159;
////		double r=7.5;
////		System.out.println(p*r*r);
////		
////		System.out.println(p*r*2);
//
//		// Task11
//
////		Scanner z=new Scanner(System.in);
////		
////		int r=z.nextInt();
////		int y=3;
////		System.out.println(++y);
//
//		// Task12
//
////		int a = earth.nextInt();
////		int b = earth.nextInt();
////		int c = earth.nextInt();
////
////		System.out.println((a + b +c)/3);
//
//		// Task13
//
////		double width = 5.6;
////		double high = 8.5 ;
////		double sum = 47.60;
////		int  sim = 2;
////		double a = 28.20;
////		 System.out.println("Area is " + width + " * " + high + " = " + sum);
////		System.out.println("Perrimeter is " + sim +" * " + width +" + " +high + " = " + a);
////		
//		// New Task
//
////		1. Input String Ex. bottle
////	     Output: The frist letter in the string is a
////	2. Input String Ex. apple
////	     Output: The last letter in the string is e
////	3. Input String. Length is an odd number. Ex. cat
////	    Output: Middle letter is a
////	4. Input String. Length is an even number. Ex. polo
////	    Output: Middle two letters are ol
////	5. Input String THIS_IS_MY_FIRSTNAME
////	    Output: FIRSTNAME
////	    Note: Your program should for String with any length that ends with FIRSTNAME.
////	6. Input String THIS_IS_MY_FIRSTNAME_IN_THEMIDDLE
////	    Output: FIRSTNAME
////	    Note: Your program should for  String with any length that ends with FIRSTNAME. This is a little bit more challenging
//
//		// Task1
//
////		System.out.println("Please,show me a word");
////		String moon=earth.nextLine();//bottle
////		System.out.println(moon);
////		System.out.println("Please,show me a letter");
////		String mars=earth.nextLine();//b
////		System.out.println(mars);
////        int commet=moon.indexOf('b')+1;
////		
////		char venus=moon.charAt(commet-1);
////		
////		System.out.println(("The "+ commet + "st letter in the string is " + venus));
//
//		// Task2
//
////        
////          System.out.println("Please,show me a word");
////          String moon=earth.nextLine();//apple
////          System.out.println(moon);
////          System.out.println("Please,show me a letter");
////          String mars=earth.nextLine();//e
////          System.out.println(mars);
////          int venus=moon.lastIndexOf(mars)+1;
////		  
////		  char commet=moon.charAt(venus-1);
////		
////		  System.out.println("The last letter in the string is " + commet);
//
//		// Task3
////		 System.out.println("Please,show me a word");
////         String moon=earth.nextLine();//library
////         System.out.println("Please,show me middle letter");
////	     int Venus=moon.length()/2;
////         
////         char commet=moon.charAt(Venus);
////         System.out.println("Middle letter is a " + commet);
//
//		// Task4
//
////		System.out.println("Please,show me a word");
////        String moon=earth.nextLine();// function
////		int venus=moon.length();//8
////		String commet=moon.substring(4/2-1, 4/2+1);
////		
////		System.out.println("Middles  two letters are ct");
//
//		// Task5
//
////		String moon=earth.nextLine();//"THIS_IS_MY_FIRSTNAME"
////		int venus=moon.indexOf('F');
////		
////		String commet=moon.substring(venus);
////		System.out.println();
//
//		// Task6
//
////		
////		String moon= earth.nextLine();//THIS_IS_MY_FIRSTNAME_IN_THEMIDDLE
////		System.out.println(moon);
////		
////		int venus=moon.indexOf('F');
////		System.out.println(venus);
////		
////		int venus1=moon.indexOf('E')+1;
////		System.out.println(venus1);
////		System.out.println(moon.substring(venus, venus1));
////		
////		//Task1
////		System.out.println("Please put your number");
////		int moon=earth.nextInt();
////		if (moon>=0) {
////			System.out.println("Number is positive");
////			
////		} else {
////           System.out.println("number is negative");
////		}
//
//		// Task2?
//		// Task3
////		System.out.println("Put your number");
////		int moon=earth.nextInt();
////		for (int i = 0; i <87; i++) {
////						
////		}
////		if (moon==87) {
////			System.out.println("The greatest 87");
////		} else {
////        System.out.println("Try again");
////		}
//
////		System.out.println("put your number");
////		int i=earth.nextInt();
////		
////		if (i%2==0) {
////			System.out.println(i+" is even");
////		} else {
////       System.out.println(i + "is odd");
////		}
////		System.out.println("put your number");
////		int i=earth.nextInt();
////		
////		if (i%2 !=0) {
////			System.out.println(i+" is odd");
////		} else {
////       System.out.println(i + " is even");
////		}
//
//		// Task3
////	System.out.println("Put number");
////             int first=str.nextInt();
////             int second=str.nextInt();
////              int third=str.nextInt();
////				
////              if (first>=second && first>=third) {
////				System.out.println(first + " is greatest"); 
////              }
////				else if (second>=first && second>=third) {
////					System.out.println(second + " is greatest");
////					
////			} else {
////              System.out.println(third +" is geatest");
////			}
//
//		// Task1
//
////		         System.out.println("Show numbers up to ten");
////		         for (int i = 1; i <= 10; i++) {
////					System.out.print(i);
////				}
//
//		// Task2
////		int sum=0;
////		for (int i = 0; i <= 10; i++) {
////			sum=sum +i;
////			
////		}
////		System.out.print(sum);
//		//
//		// Task3
////		int s=earth.nextInt();
////		for (int i = 1; i <= 10; i++) {
////			System.out.println(s + "*" + i + " = " + (s*i));
////		}
////		
//
//		// Task4
//
////		System.out.println("Enter factorial number");
////		int number=earth.nextInt();
////		int fact=1;
////		for (int i = 1; i <=number; i++) {
////			fact=fact*i;
////		}
////		System.out.println(fact);
////		}
//
////	System.out.println("Enter factorial number");
////	int number=earth.nextInt();
////	int fact=1;
////	for (int i =number; i >=1; i--) {
////		fact=fact*i;
////	}
////	System.out.println(fact);
//
//		// Task7
//
//		// int i=2;int q=2;int w=2;int e=2;int r=2;int t=2;
////		int even = 0;
////		int odd = 0;
////		for (int i = 0; i < 3; i++) {
////			int num = earth.nextInt();
////			if (num % 2 == 0) {
////				even = even + num;
////
////			} else {
////				odd = odd + num;
////
////			}
////			
////		}
////		System.out.println("Sum Even: " + even);
////		System.out.println("Sum odd: " + odd);
//
//		                              //Task6
//		
////		double d1=12.345678;
////		double d2=12.345987;
////		d1 = d1*1000;
////		d2 = d2 *1000;
////		System.out.println((int)d1);
////		System.out.println((int)d2);
////	if ((int)d1==(int)d2) {
////		System.out.println("They are equals");
////	} else {
////        System.out.println("Not equal");
////	}
//		                 //Task9
////		int num1=earth.nextInt();
////		int num2=earth.nextInt();         //  HCF finder
////		int g=0;
////		if(num1>num2){
////			g=num2;
////		}
////		else {
////		g=num1;}
////		for (int i =g; i >=1; i--) {
////			if(num1%i==0 && num2%i==0) {
////				System.out.println( "HCF is " +i);
////				break;
////			}
////		}
////		
////	}
////		int num1=earth.nextInt();
////		int num2=earth.nextInt();
////		int g=0;
////		int q=0;                              //HCF
////		if(num1>num2){
////			g=num2;
////		}
////		else {
////		g=num1;}
////		if(num1%num2!=0 && num2%num1!=0) {
////		q=g/2;}       //i ad some conditions and it will begin hald of small number,it is more effeciently
////		else {
////			q=g;
////		}
////		System.out.println(q);
////		for (int i =q; i >=1; i--) {
////			if(num1%i==0 && num2%i==0) {
////				System.out.println( "HCF is " +i);
////				break;
////			}
////		}
//		
//		
//			
//		                    //Task14
//		
//		//Write a program to print Fibonacci series of n terms where n is input by user:
//		//0.1.1.2.3.5.8.13.21
////		int n=5;
////		int a=0;
////		int b=1;
////		int temp=0;
////		System.out.print(a +"," );
////		for(int i = 0;i< n;i++) {
////			temp=a;
////			a=a+b;
////			b=temp;
////			System.out.print(a + ",");
////		}
//		          // Task15
////		System.out.println("Enter number");
////		int x=1;
////		int y=1;                         ???????????????
////		int z=1;
////		for (int i = 1; i<=5; i++) {
////			
////			x=x/y;
////			x=z;
////			System.out.print((double)x + " +");
////		}
//		     //Task 
////	//	Input :12345 output:54321
////		String a="12345";
////		int y=a.length()-1;
////		while(y>=0) {
////			System.out.print(a.charAt(y));
////			y--;
////		}
////
////String a = "abucdeofghi"; // find vowels
////for (int i = 0; i <= a.length() - 1; i++) {
////
////	a = a.toLowerCase();
////	if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'i'
////			|| a.charAt(i) == 'u') {
////
////		System.out.print(a.charAt(i));
//
//               // Task
//
////Take a letters from word australia
////String a="Australia";
////	for (int i = 0; i <=a.length()-1; i++) {
//// if(a.charAt(i)=='a' || a.charAt(i)=='A') {
////	System.out.print(a.charAt(i)+" ");
////}
////	
////}
////		int s=1234500;
////		String x=s +"";
////		for (int i =x.length()-1; i>=0; i--) {
////			System.out.print(x.charAt(i));
////		int x=123450;
////		int y=0;
////		while(x>0) {
////			y=y*10+x%10;
////			x=x/10;
////			
////}	
////	System.out.println(y); 
////}// 0+00
////  12345
////  0+55
////  1234
////  50+454
////  123
////  540+3 543
////  12
////  5430+2 5432
////  1
////  54320 + 1 54321
////  0.1 
//		    // Task i dont know how did it
////  String s="123456789";                        
////  for (int i =0; i<=s.length()-1; i++) {      // 123456789
////		System.out.println(s.substring(i));     // 23456789
////  }                                           // 3456789
//                                                // 456789
//                                                // 56789
//                                                // 6789
//                                                // 789
//                                                // 89
//                                                // 9
//  
//	  
////	String s="123456789";                        
////  for (int i =s.length()-1; i>=0; i--) {      // mirror
////		System.out.println(s.substring(i));	
////  }
//	      
//		
//		
////		String s="Australia";                        
////	  for (int i =0; i<=s.length()-1; i++) { 
////		  if(s.charAt(i)=='a' || s.charAt(i)=='A')
////			System.out.print(s.charAt(i));	
////	  }
////		int count=0;
////	  String s="Australia";                        
////	  for (int i =0; i<s.length(); i++) { 
////		  s=s.toUpperCase();
////		  if(s.charAt(i)=='A' ) {
////				
//////				System.out.print(s.charAt(i));
//		
////		  }  
//		  }
		  	
		            //Task array1 no23
		//Given an int array length 2, return true if it does not contain a 2 or 3.
    //1st way solution
//		public boolean no23(int[] nums) {
//			if (nums[0] ==2 ||nums[0] ==3 || nums[1] ==2 ||nums[1] ==3) {
//				return false;
//			}
//			else return true;
	
	


}	
}

