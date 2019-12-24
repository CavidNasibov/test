package NestedFoorloop;

import java.util.Arrays;

public class nestedForloop {
	public static void main(String[] args) {
		// 0
//	01
//	012
//	0123
//	01234
//	for (int i = 0; i < 5; i++) {                               
//		for (int j = 0; j <= i; j++) {                          
//			System.out.print(j);                                
//			                                                    
//		}
//		System.out.println();
//	}
		// run out first array then second
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
//	System.out.println(Arrays.deepToString(arr));
		// for (int i =0 ; i <1; i++) {
		for (int i = 0; i <1; i++) {
			
		
			for (int j= 0; j <arr[1].length; j++) {
				
				System.out.print(arr[i][j]);
				
			}System.out.println();
		
		}
	}
}
