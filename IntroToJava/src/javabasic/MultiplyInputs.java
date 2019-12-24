package javabasic;

import java.util.Scanner;

public class MultiplyInputs {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input first number");
		int num1 =keyboard.nextInt();
		System.out.println("Input second number");
		int num2 =keyboard.nextInt();
//		int prod = num1*num2;
//		System.out.println("The product of your inputs is:" + prod);
		System.out.println("The product of your inputs is:" + (num1*num2));


		
	}

}
