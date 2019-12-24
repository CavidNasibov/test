package arrays;

import java.util.Arrays;

public class TwoDimArrays {
public static void main(String[] args) {
	int [] [] arr=new int [2] [3];//1st way compile two array
//	arr [0] [0]=1 ; 
//	arr [0] [1]=2 ; 
//	arr [0] [2]=3 ; 
//	arr [1] [0]=15 ; 
//	arr [1] [1]=8 ; 
//	arr [1] [2]= 12; 
	int [] [] arr1= {{1,2,3},{15,8,12,13}};
//	System.out.println(Arrays.deepToString(arr));
	//System.out.println(arr[1][3]);
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(Arrays.toString(arr1[i]));
//		for (int j = 0; j < arr1[i].length; j++) {
			
		}
	}
}

