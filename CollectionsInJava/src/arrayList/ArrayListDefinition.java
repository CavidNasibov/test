package arrayList;

import java.util.*;


public class ArrayListDefinition {
public static void main(String[] args) {
	
	//ArrayList arrayList=new ArrayList();          //you have two way to crate ArrayList ,u can look left side first 2 lines 
	List <String> arr=new ArrayList();         //if you put <>this symbol and wite (not primitive) class name (exp.String ,Ineteger etc.) name,its mean Arraylist can contain just Strings
	                                            
//	arr.add("Tom");                           ////if you want add array,you have to use method number14,15      
//	arr.add("John");
//	System.out.println(arr.get(1));
//	System.out.println(arr.get(1).contains("n"));
//	System.out.println(arr.get(1).length());
//	System.out.println(arr.get(1).charAt(0)) ;                                         //you can use all string mrthods on arraylist as like line number 16
//	System.out.println(arr.size());          //in Arraylist if wanna figure our length of ArrayList use size num17
//	arr.add(2,"Jess");
//	System.out.println(arr.contains("Jess")); //if wanna check is there any array name of Jess u can use contain method num 19
//	System.out.println(arr.getClass());
	                                             
//	List <String> arr=new ArrayList();          
	
//	arr.add("Green");
//	arr.add("Yellow");
//	arr.add("Black");
//	arr.add("Red");
//	
//	for (int i = 0; i < arr.size(); i++) {
//		
//		System.out.println(arr.get(i));//1
//		
//	}System.out.println(arr);//2
//	System.out.println(arr.get(0));//3
//System.out.println(arr.set(0, "Brown"));//4
//	 System.out.println(arr);//5
//	
//	System.out.println(arr.remove(3));	//6                //if you wanna romove one of the arrays u can use method romove num37
//		System.out.println(arr); 
//	System.out.println(arr.contains("Green"));//7
 
//		System.out.println(arr);
//**************************************************************************************************	
	
	                                 //Day2 -- "import java.util.*;" it formula u can write top of class to import all function
List <Integer> list=new ArrayList<>();
List <Integer> list1=new ArrayList<>(Arrays.asList(1,3,4,5,6));//its way how to add arguments in one line..
list1.add(2);
//Collections.sort(list1);                                  //its way to sort ArrayList...Look line 50 there is missing num2,in next line i add 
//                                                          2,and then i print,its adding to line
System.out.println(list1);

String [] array= {"A","B"};
List <String> arrayList=new ArrayList <String>(Arrays.asList(array));//if you want to convert array to Arraylist,u can use this method
arrayList.add("C");//and then u can add how many argument you want
System.out.println(arrayList);




}
}
