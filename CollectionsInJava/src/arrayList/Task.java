package arrayList;

import java.util.*;

public class Task {
public static void main(String[] args) {
//8:34 --8:54 -->explaination of task	
	String [] array= {"5","A","6","8","B","%","#","11"};
	List <String> arrayList= new ArrayList<>(Arrays.asList(array));
	System.out.println(arrayList);
	List <Integer> arrayList2= new ArrayList<>();
	
	for (int i = 0; i < arrayList.size(); i++) {
		
		char ch=arrayList.get(i).charAt(0);
		if(Character.isDigit(ch)) {
			int num=Integer.valueOf(arrayList.get(i));
			arrayList2.add(num);
		}
		
	}System.out.println(arrayList2);
	
	
}
}
