package javabasic;

import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//				System.out.println(input.nextInt());
				System.out.println("Please input first number");
				int i= input.nextInt();
				System.out.println("Your first number is:" + i);
				System.out.println("Please input second number");
				int y= input.nextInt();
				System.out.println("Your first number is:" + y);
				int answer = i + y;
				System.out.println("Sum of your inputs are:" + answer);
		
	}

}
