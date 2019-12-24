package javabasic;
import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner earth = new Scanner(System.in);

//	boolean flag=true;
//	
//	while(flag) {
//		System.out.println("Hey");
//		flag=false;
//	}
//	int y =0; 	
//	while(y<=10) {
//		System.out.println(y);//with this we can write numbers since 0 up to 10
//	y++;
//	}
//	 int i=10;
//	 while(i>=0) {
//		 System.out.println(i);//with this we can run out numbers since 10 up to 0.
//		 i--;
//	 }
//	int i=0;
//	String str="Azerbaijan";
//	while(i<=9) {
//		System.out.println(str.charAt(i));//this out give us letters
//		System.out.println(i);//this out give to us index of letters.if you remove this out .You can see letters of str
//		i++;
//	}
//	String str="Azerbaijan";
//	int y=str.length()-1;
//	while(y>=0) {
//		System.out.print(str.charAt(y));//difirient way reverse with while loop
//		y--;
//		
//	}

//	int x=123450;
//	int y=0;
//	while(x!=0) {
//		y=y*10+x%10;
//		x=x/10;

//}	
//System.out.println(y); 

//		MathClass mt = new MathClass();
//		mt.substact(7, 5);
//	}
	// codingBat website
	
	
		//explenation break and continue..excamples
		
//		int number=10;
//		while(number>0)
//		{
//			number=number-2;
//		if(number==4)
//			break;     //Break means ,if number is 4 it must to stop;result  is will 8 6 The end.
//		System.out.println(number);
//			
//		}System.out.println("The end.");
		
		
		int number=10;
		while(number>0)
		{
			number=number-2;
		if(number==4)
			continue;     //Continue means ,if number is 4 it must to jump from 4 to 2 and continue;result  is will 8 6 2 0 The end.
		System.out.println(number);
			
		}System.out.println("The end.");
			
	}
}
