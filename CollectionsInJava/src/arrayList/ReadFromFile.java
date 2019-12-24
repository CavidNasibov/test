package arrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
public static void main(String[] args) throws FileNotFoundException {
	
	File file = new File("C:\\Users\\arcelik\\Documents\\names.txt");
	Scanner sc=new Scanner(file);
//	String [] names=new String [4];
	List <String> list=new ArrayList<>();
	
	
	
	while(sc.hasNext()) {
		String name=sc.nextLine();
		list.add(name);
		//System.out.println(name);
	}

//	for (int j = list.size()-1; j < 0; j--) {
//		
//		if(list.get(j).charAt(0)!='B')
//		System.out.println(list.get(j));
//		
	for (int i = 0; i <list.size(); i++) {
		String name=list.get(i);
		System.out.println((name + "s").toUpperCase());
	}
	
	System.out.println(list);
	
	
	}
}

