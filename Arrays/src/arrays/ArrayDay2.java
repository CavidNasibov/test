package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDay2 {

	public static void main(String[] args) {
//				//int [] arr = new int [5];
		int [] arr = {4,6,1,0,9,2};
//		int [] arr1 = arr;
		int [] arr1 = {2,4,1,0,6,9};
//		System.out.println(arr[3]);
//		arr[3] = -4;
//		System.out.println(arr[3]);
//		System.out.println(arr.length);
////		
//////		String str = "hello";
//////		String str1 = new String("hello");
//////		System.out.println(str.equals(str1));
//////		System.out.println(Arrays.toString(arr));
//////		System.out.println(Arrays.toString(arr1));
//////		System.out.println(arr.equals(arr1));// Don't use to compare two arrays
		Arrays.sort(arr);
//////		Arrays.sort(arr1);
//////		System.out.println("arr: " + Arrays.toString(arr));
//////		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println(Arrays.equals(arr, arr1));//Use this method for comparing
//////		
		System.out.println("Output from binary search: " + Arrays.binarySearch(arr, 3));
		//int [] arr2 = Arrays.copyOf(arr, 4);
		//System.out.println("arr2 after copyOf " + Arrays.toString(arr2));
		//;
////		
////		
////		Scanner keyboard = new Scanner(System.in);
//////		System.out.println("Enter 5 numbers");
//////		int [] array = new int [5];
//////		System.out.println(Arrays.toString(array));
//////		for(int i = 0; i < 5; i++) {
//////			int num = keyboard.nextInt();
//////			array[i] = num;
//////			System.out.println("Array element: " + array[0]);
//////		}
//////		System.out.println(Arrays.toString(array));
//////		Arrays.sort(array);
//////		System.out.println(Arrays.toString(array));
//////		System.out.println("The greatest integer is " + array[array.length-1]);
//		
//		//************************************************************************************************************************
//		
//		
////		int []arr= {1,2,3,4,5,6};
////		System.out.println(arr[0]);//this func.we can find what is the steps elemen.input turn find which number
//		System.out.println(Arrays.binarySearch(arr, 3));//w.t.f.we can find indexof the element.input element find turn
////		arr[3]=3;
////		System.out.println(arr[3]);
////		int [] arr1={1,2,3,4,5,6};
////		System.out.println(arr==arr1);//if you want compare to arrays with sign equals equals== you can just compare area.witch one answer is false
////		System.out.println(arr);
////		System.out.println(arr.equals(arr1));//same thing with this.this func.compare area as well.and answer is false
//		
////		Arrays.sort(arr);
////		Arrays.sort(arr1);
////		System.out.println(Arrays.equals(arr, arr1));//just with this func.we can compare value of arrays.By the way you have to sort it ot first
//		//off all.Because if you want respons true .arrays have to be exact  similiar.same length,same numbers .diffirent variables.
////		String str="Hello";
////		String str1="Hello";
////		System.out.println(str.equals(str1));//with String boolean works difirent.if their objects are same diffirent names both func.are true
////			System.out.println(str==str1);//if you create String str1=new String(); and compare with str ,response are false
		
	}
}
//		
//	
