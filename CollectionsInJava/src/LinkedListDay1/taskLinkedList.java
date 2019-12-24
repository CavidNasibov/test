package LinkedListDay1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class taskLinkedList {

	public static void main(String[] args) {
		
		List <String> list1=new LinkedList<String>();
		LinkedList <String> list2 =new LinkedList<String>();
		list2.add("D");
		list2.add("C");
		list2.add("W");
		list2.addLast("P");
		System.out.println(list2);
//		Collections.reverse(list2);//reverse function LInkedLIst
		System.out.println(list2);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2);
		}
		specified(0, list2);
		
		
		
		
		
	}
	public static void specified(int i, LinkedList <String> list) {
		for (; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

