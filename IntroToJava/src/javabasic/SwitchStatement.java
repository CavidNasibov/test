package javabasic;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args)
	{
//		String light="red";
//		switch(light){
//		case "green":                     //it same thing with if else function,but with this you cant use boolean 
//			System.out.println("GO");     //if you want put switch combination quick just write "swi ctrl space enter"
//		break;
//		case "red":
//		System.out.println("Stop");
//		break;
//		case "yellow":
//		System.out.println("Prepare to go");
//		default:
//			System.out.println("Call The police");
//		}
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Please enter  gender");
//		String gender=sc.nextLine();
		
//		switch (gender.toLowerCase()) {
//		case "female":
//			System.out.println("F");
//			break;
//		case "male":
//			System.out.println("M");
//			break;
//		case "others":
//		case "no":	
//			System.out.println("O");
//			break;
//		default:
//			System.out.println("UNKNOWN");
//			break;
//		}
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integers. To stop enter non int");

		int countPos = 0;

		int countNeg = 0;

		int countZeros = 0;

		while(sc.hasNextInt()) {

			int num = sc.nextInt();

			if(num>0)

				countPos++;

			else if(num<0)

				countNeg++;

			else countZeros++;

		}

		sc.close();

		System.out.println("Negative: " + countNeg);

		System.out.println("Positive: " + countPos);

		System.out.println("Zeros: " + countZeros);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

