package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	
		public static void main(String[] args) {
		
	
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("alma");
		arrayList.add("Nigar");
		arrayList.add("der");
		arrayList.add("sert");
		
//1st way to Iterate(with for loop)
for (int i = 0; i < arrayList.size(); i++) {
	System.out.print(arrayList.get(i) +" ");
}
//2nd way(with each loop,efficient way)
for (String string : arrayList) {
	System.out.print(string +" ");
}
//3rd way to Iterate(with while loop)		
int i=0;
while(i<arrayList.size()) {
	
	System.out.print(arrayList.get(i)+" ");
	i++;
}
//4th way to Iterator -(with Iterator)
Iterator<String> iterator = arrayList.iterator();
while(iterator.hasNext()) {
	System.out.print(iterator.next()+ " ");
}
//5th way to Iterator (with ListIterator)
ListIterator<String> li= arrayList.listIterator();
while(li.hasNext()) {
	System.out.print(li.next()+ " ");
	}
//6th way to Iterator (with forEach-best way)
arrayList.forEach((list)->{
	System.out.print(list +" ");

});		
		
		}		
		
		
}

