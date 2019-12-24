package arrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberExercise {
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("C:\\Users\\arcelik\\Documents\\number.txt");
	Scanner sc=new Scanner(file);
//	String [] names=new String [4];
	List <Integer> list=new ArrayList();
	while(sc.hasNext()) {
	//	String name=sc.nextLine();
		list.add(sc.nextInt());
		
}
	
	

double sumOfNums=0;
for (int i = 0; i < list.size(); i++) {
	sumOfNums=sumOfNums + list.get(i);
		
}
System.out.println(list);
System.out.println(sumOfNums/list.size());
Collections.sort(list);
System.out.println("Lowest NUmber: " + list.get(0) );
System.out.println("Highest NUmber: " + list.get(list.size()-1) );
for (int i = 0; i < list.size(); i++) {
	if(list.get(i)%2==0) {
		
		System.out.print(list.get(i) + " ");
		
	}
		
}
}
}