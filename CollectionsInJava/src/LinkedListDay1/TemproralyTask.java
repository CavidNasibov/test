package LinkedListDay1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TemproralyTask {
	public static void main(String[] args) {

		// 1st way ti Iterate
//	    ArrayList names = new ArrayList();
//	    names.add("Chaitanya");
//	    names.add("Steve");
//	    names.add("Jack");
//
//	    Iterator it = names.iterator();
//	 
//	    while(it.hasNext()) {
//	      String obj = (String)it.next();
//	      System.out.println(obj);
//	    }
//	    //2nd way to Iterate
//	    ArrayList<String> collection = new ArrayList (Arrays.asList("How", "To", "Iterate", "In", "Java"));
//	    
//	    collection.forEach(s -> System.out.println(s));
		// 3rd way
//	    Collection<String> collection2 = (Arrays.asList("How", "To", "Iterate", "In", "Java"));
//        
//	    for(String s : collection2) {
//	        System.out.println(s);
//	    }
		// 4th way
		List<String> list = Arrays.asList("How", "To", "Iterate", "In", "Java");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
