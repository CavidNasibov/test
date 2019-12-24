package LinkedListDay1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDay1 {
// 9:11--> 9:40 linkList
//9:41-->10:07 tasks
//9:17-->continue task
	public static void main(String[] args) {
		List <String> list1=new LinkedList<String>();
		LinkedList <String> list2 =new LinkedList<String>();
		list2.add("A");
		list2.add("B");//its same prosedure  to adding in LinkedList
		list2.addFirst("C");//its fora adding object to first step
		list2.addLast("D");//its fora adding object to last step
		list2.add(2, "E");//its for adding object where you want,just need write which step,and object 
		System.out.println(list2.peek());//its removing all object except first one
		System.out.println(list2.poll());
		list2.push("D");//its just adding the object fisrt step
		list2.removeFirstOccurrence("D");//its removing first object
		Collections.reverse(list2);
		list2.remove("E");//removing object
		System.out.println(list2);
	}
	
	
	
	
	
}
