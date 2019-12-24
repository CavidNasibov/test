package javabasic;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class LoopClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		for(int i= 0;i<11;i++) {
//			
//			System.out.println(i);
//		     {
//			System.out.println("input your pwd");
//			String pwd=sc.nextLine();
//			String pwdInDB="qwerty";
//			for(int i= 0;i<2;i++)
//			if(pwd.equals(pwdInDB)) {
//				System.out.println("Well come");
//			}
//			else {
//				System.out.println("Wrong password");
//				pwd=sc.nextLine();
//			}
//		    }
//			System.out.println("Your account is blocked");
			
			
			//write a  program to display
			//odd numbers up to users input
			//input =10 output:1,3,5,7,9
//		          int number=20;
//			      for (int i = 0; i <= 20; i++) { //its help to us find just odd numbers
//					if(i%2!=0) {                    //if you want to find even numbers must ot write if(i%2==0)
//						System.out.print(i +",");
		
//		
//		String S=sc.nextLine();
//	//	
//		                char ch=S.charAt(0);//In order to get ASCII value for any letter type of letter should be char.
//		                //If you cast char to an int it will give the value from ASCII table 
//		                System.out.println((int)ch);
//		                //EX:
//		                
//		                //Or you can assign char to int to get ASCII value
//		                int ch1=S.charAt(0);
//		               // System.out.println((int)ch);
//		                System.out.println(ch1);
		
		
//		                   String s="monkey";
//		                   String reverse="";
//		                   for (int i=s.length()-1; i >=0; i--) {
//		                	   reverse=reverse+s.charAt(i);
//							System.out.println(reverse);
							
//		String s="monkey";
//        for (int i = 5; i >= 0; i--) {
//			System.out.print(s.charAt(i));
			
//			String s="monkey";
//			String d="";
//	        for (int i=s.length()-1; i >= 0; i--) {
//	        	d=d+s.charAt(i);
//	        	System.out.println(d);		
//	        }
          
		int i,j,n;
		   System.out.print("Input number of rows : ");
		 Scanner in = new Scanner(System.in);
				    n = in.nextInt();

		   for(i=1;i<=n;i++)
		   {
			for(j=1;j<=i;j++)
			  System.out.print(j);

		    System.out.println("");
		    }
		
	}             
		
		
}			
		
		
		
		
		
		
		

		
			      
		
	

	
