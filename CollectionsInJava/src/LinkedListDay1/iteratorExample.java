package LinkedListDay1;

import java.util.Iterator;
import java.util.LinkedList;

public class iteratorExample {
public static void main(String[] args) {
	
	
	LinkedList<String> c1=new LinkedList<>();
	c1.add("Red");
	c1.add("Black");
	c1.add("White");
	c1.add("Blue");
	c1.add("Green");
	Iterator<String> iterator=c1.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
