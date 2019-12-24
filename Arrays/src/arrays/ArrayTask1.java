package arrays;

import java.util.Arrays;

public class ArrayTask1 {
public static void main(String[] args) {
	
	//Create array of an integers  with length of 7
	//Print all elements of an Array in the same line 
	//sort
	//print again
	//search of the 11
	
	int [] arr = {4,2,3,4,5,0,7};
//	System.out.println(Arrays.toString(arr));
//	Arrays.sort(arr);
//	Sytem.out.println(Arrays.toString(arr));
////	System.out.println(Arrays.binarySearch(arr, 11));
//	/// Other reverse method
//	int []arr1=new int[arr.length];
//	int j=0;
//	for (int i = arr.length-1; i >=0; i--) {
//		
//	arr1[j]=arr[i];
//	j++;
////	}System.out.println(Arrays.toString(arr1)); s
//	
	//**********************************************************************
	
	
	          //Switch the indexs than reverse
	//int [] arr = {4,2,3,4,5,0,7};
	int l=arr.length-1;
	int temp=0;
	for (int i = l; i < arr.length/2; i--) {
		temp=arr[i];//7
		arr[i]=arr[l-i];//0
		arr[l-i]=temp; //7  //dont work ???????????????
		System.out.println(arr[i]);
		System.out.println(arr[l-i]);
	}
	System.out.println(Arrays.toString(arr));
	
	
}
}
