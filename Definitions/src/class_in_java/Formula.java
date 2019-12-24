package class_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Formula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
//                                     String--//string is immutable
		
//		String str="television";
//		System.out.println(str.replaceAll("e", "A"));//w.t.f.you can change leteer or word other one..
//		System.out.println(str.codePointAt(0)); ASCII number 
//      System.out.println(str.replaceAll("sion","zor"));	
//		String str="television      ";
//		System.out.println(str.trim());              //w.t.f.y.c.remove space of the word ,but just  beginning and end .not included between
//		String s="Pencil     ";
//		System.out.println(s.concat("1"));          //w.t.f.y.c.concatinate character
		
//		String word = "Hello World";
//		System.out.println(word.charAt(1) );//      1. By this function which number you will write between the parentesis ,
//		Java will run that Letter.Java always  starts by zero.and because if you have wrtitten 1 it will show you letter e .
//		String sign = "!";
//		System.out.println(word + sign);            2.// This function is called "concatenation"
//		word = word + sign;
//		System.out.println(word + number);
//		System.out.println(""+2 + 4 );              3.//if you will write after double quotes + number + number ..they just combine
//		// (""+2+4) its - 24 
//		System.out.println(word.substring(5));//    4. by this function you can write index(digit) ,java will run all letters after than
//		                                            // letter which number suits .if you have 5 ,it will be World.Because 5 is space /
//		System.out.println(word.substring(2,7));//     5. If we write two nums ,its mean java run between that letters /
//		System.out.println(word.length());//           6.if we want to know how many charachters(letters) on that object,we have 
//		System.out.println(word.indexOf("l"));//       7.this function helps to us define index of the letter.We put l its 2
//      System.out.println(word.indexOf("o" , 5));//   8.using this func.we can realize whic index is seconf  letter "o"//		
//		System.out.println(str += " is cool");         9.if you want to change str ,you have to variable(Strings) += "somthing",
//		System.out.println(S.subSequence(2, 4));//    10..with this func.can take word between the numbers which suits to letters
//      System.out.println(S.equals(T));//             10.with this func.we can compare to two object.but  letter of the word 
//      System.out.println(S.equalsIgnoreCase(R));//     11.with this func.we can compare to two object.just count object of the numbers or letters
//      System.out.println(S.startsWith("AZ"));//         12.w.t.f.we can check is it start this word which one we show
//      boolean Q=S.contains("jani");//        14.w.t.f.we can f.o.does it contains this combination or not
//		 System.out.println(w.charAt(w.length()-1));//      18.This formula help to us find the letter of the word.doesnt  matter how long this word or will change in futur		

//		 String c = "Table";
//		System.out.println( c.charAt(c.length()/2));//   19.w.t.f.we can find middle letter .But this formula works//just "Odd numbers" 

//		String x="Monkey";
//		 System.out.println(x.substring(x.length()/2-1, x.length()/2+1));// 20.w.t.f.we can find middle letter .But this formula works just "Even numbers"

//		 System.out.println(x.length()%2);             //w.t.f.w.c.f.o.it is odd number or even number.if print out 0 its means even num.
                                                    //if it difirent than 0 it means odd number.We just a divided length of word 2 
                                                    //and if there is not reminder its even number		

//		 if( x.length()%2 == 0)  {                 // if reminder equals to zero
//	System.out.println(x.substring(x.length()/2-1, x.length()/2+1)); //let works this position
//	 }  
//	 else //if reminder doesnt equals to zero  { 
//		 System.out.println( x.charAt(x.length()/2));   //let works this position
	 //conclusion .you can change word push enter its show you middle letter doesnt matter it is even or odd number 
	 //count of letters
//	 }
		
		
//		                                      StringBuilder
		
//		System.out.println(sb);
//		sb.append("s");            //w.t.f.y.c.concatinate letter to word
//		System.out.println(sb);
	
//		String str="apple";
//		String str1=new String ("apple");//two boolean do same same thing comparing ,but there is one difirennse
//		System.out.println(str==str1); // this compare where is source,and response false.because difirent source they located
//		System.out.println(str.equals(str1));but this function compare words ...response is true
		
//		System.out.println(sb.reverse());//reverse with string builder
//		System.out.println(sb.append(1));
		
//		System.out.println(sb.codePointAt(0));w.t.f.you can put number and find letter on schedule IISC
//		System.out.println(sb.delete(1, 4));w.t.you can delete letters between this numbers
//		System.out.println(sb.deleteCharAt(3));with this just one letter
//		System.out.println(sb.lastIndexOf("p"));
//		System.out.println(sb.replace(1, 3, str1)); switch letter of place	
		
		
//**************************************************************************************************************************		
		// String S=sc.nextLine();
		//

		// Formula 1
		// int i='a';
		// System.out.println(i);//In order to get ASCII value for any letter type of
		// letter should be char.
		// you can write interge as char
		// OR
//	char ch=97;
//	System.out.println(ch);//Or you can assign char to int to get ASCII valu;

		// ***************************************************************************************************************
		// Formula2
		// for (int y = 0; y <= 20; y++) { //its help to us find just odd numbers
		// if(y%2!=0) { //if you want to find even numbers must ot write if(i%2==0)
		// System.out.print(y +",");

//	*******************************************************************************************************************

		// Formula3(reverse)

//	String s="monkey";
//    for (int i = s.length()-1; i >= 0; i--) {       ///reverse first
//		System.out.print(s.charAt(i));
//	 
//		
//		String s="monkey";
//		String d="";
//        for (int i=s.length()-1; i >= 0; i--) { //reverse second
//        	d=d+s.charAt(i);
//        	System.out.println(d);	
		
		
//******************************************************************************************************	
		
//                      Palindrome (abba civic	)	
	
		//new Task().palindrome1("abbam");
	/*Palindrome abba civic
	 * Wrote method as if it is palindromes say yes else no
	 * Interview question
	 *  */
	         //1st way to solv
//		public void palindrome(String str) {
//			String reverse="";
//			int i=str.length()-1;
//			while(i>=0){
//				reverse=reverse+str.charAt(i);
//				i--;
//			}if(str.equals(reverse)) {
//				System.out.println("yes");
//				
//			}else {
//				System.out.println("no");
//			}
//			//Second way to solv
//		}
//
//			
//		public void palindrome1(String str) {
//			StringBuilder sb=new StringBuilder(str);
//			sb.reverse();
//		if(str.equals(sb.toString())) {
//			System.out.println("yes");
//			
//		}else {
//			System.out.println("no");
//		}
//**********************************************************************************************************************************

		// Formula4 reverse with while

//  int x=1234500;
//	int y=0;
//	while(x!=0) {       //with this formula you can reverse numbers witch one ends by zero exp 1234500  to reverse 54321
//		y=y*10+x%10;
//		x=x/10;

//***************************************************************************************************************************************	
		// TErnary operator
		// 1st way
//	int num=-9;
//	String str="";
//	
//	if(num>0) {
//		str="number is positive";
//		
//	}
//	else str="number is negative";
//	System.out.println(str);

		// Effeciently way

//	 String s=num>0?"number is positive":"number is negative";
//		   System.out.println(s);
//*************************************************************************************************************
		                     //Polimorphism
/*https://beginnersbook.com/2013/03/polymorphism-in-java/
 * 
 *  Polymorphism is the ability of an object to take on many forms. In other words, polymorphism allows you 
 *  to define one interface and have multiple implementations. The word “poly” means many and “morphs” means 
 *  forms, So it means many forms.
 *  In Java polymorphism is mainly divided into two types:

Compile time Polymorphism
Runtime PolymorphismIn 

1.Compile time polymorphism: It is also known as static polymorphism. This type of polymorphism is achieved by
 function overloading or operator overloading.
 Method Overloading: When there are multiple functions with same name but different parameters then these 
 functions are said to be overloaded.
 // Java program for Method overloading 
  
class MultiplyFun { 
  
    *Method with 2 parameter* 
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    * Method with the same name but 2 double parameter *
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
  
        System.out.println(MultiplyFun.Multiply(2, 4)); 
  
        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
    } 
} 
      2.Runtime polymorphism
       Method overriding, on the other hand, occurs when a derived class has a definition for one of
        the member functions of the base class. That base function is said to be overridden.
       This type of polymorphism is achieved by Method Overriding.
       
public class Animal{
   public void sound(){
      System.out.println("Animal is making a sound");   
   }
}
class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
    	Animal obj = new Horse();
    	obj.sound();
    }
}
********************************************************************************************************
                             Encapsulation
                             
Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance,
 polymorphism, and abstraction.
 To achieve encapsulation in Java −

Declare the variables of a class as private.

Provide public setter and getter methods to modify and view the variables values.


public class EncapTest {
  
   private int age;

   public int getAge() {
      return age;
   }
public void setAge( int newAge) {
      age = newAge;
   }



 * 
 */
		
		
		
		
		
		              // Definition of Interfaces

		
		
		// https://www.w3schools.com/java/ref_keyword_implements.asp
		// https://www.tutorialspoint.com/java/java_interfaces.htm
		
	    //Interface can have only abstract methods
		// An interface is a reference type in Java. It is similar to class. It is a
		// collection of abstract methods.
		// You have write "word interface " instead word" class" above,as public
		// interface "interfaceName";
		// All interface methods would be public abstract,even it is not appear,it is means
		// default but it has.saying on e word u can use 2 ways,as below
		// public abstract void car(double speed);
//		void car(double speed);

//		void car1();

//		void car2();
		// We can create new class and extend to interface class(DefinitionInterfaces)
		// ,but ininterface it is not extend--it calls implement
	    //U can see on class DefinitionInterfaces2.  And again same things it wont compile and u must to call overide as extending//look-->DefinitionInterfaces2
	    //U can extend class just for one class ,but with implement u can implement class multi interfaces. look class -->bmw
		//Abstractor A can extend abstractor B  ;
	    // interface A can extend interface B...If class implements A interface its means that class already implimented B interface same time..
	    //if abstract class implimented interface  ,its not important override..Because in future which class will want to extand that abstract
		//that class can be override that methods
		// Interface has only static and final variables
		
		                //About final method
		// in interface variable always is "public static final".
		//"Final" means :if you want nobody can change variable value in any classes ,that time u can use final...
		//if you want any method cant be overriding ,declare that method to "final"
		//if you want any class cant be extending ,declare that class to "final"  ;
//*****************************************************************************************************************************************************		
		
//		                       Definition Of Abstraction
		
		// Abstraction is a process of hiding the implementation details from the user.
		// Оnly the functionality will be provided to the user.
	   // protected class methods can use just child class
		// Encapsulation is data hiding(information hiding) while Abstraction is detail
		// hiding(implementation hiding)
	   //An abstract class is a class that is declared with abstract keyword.
	    //An abstract method is a method that is declared without an implementation.
	    //An abstract class may or may not have all abstract methods. Some of them can be concrete methods
	    //A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
	      //Any class that contains one or more abstract methods must also be declared with abstract keyword.
//	       Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also
	     //Abstract class can have final, non-final, static and non-static variables.
	
//*********************************************************************************************************************************	
		
//	                          Definition Of Enheritance
		
	//Inheritance is a mechanism wherein a new class is derived from an existing class;	
	//A class derived from another class is called a subclass, whereas the class from which a subclass is derived is called a superclass;
	// A subclass can have only one superclass, whereas a superclass may have one or more subclasses;
	//Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding)
	//Super we have to write first statement...it doesnt work other way		
		
//***********************************************************************************************************************************
//		                                      Array
//		String [] daysOfWeek=new String [7];
//		daysOfWeek [0] ="Monday";
//		daysOfWeek [1] ="Tuesday";
//		daysOfWeek [2] ="Wensday";
//		daysOfWeek [3] ="Thursday";
//		daysOfWeek [4] ="Friday";
//		daysOfWeek [5] ="Saturday";
//		daysOfWeek [6] ="Sunday";
//		System.out.println(daysOfWeek.length);
		
	//	 char [] ch= {'h' , 'e' , 'l' , 'l' , 'o'};
//			ch [0]='h';
//			ch [1]='e';
//			ch [2]='l';
//			ch [3]='l';
//			ch [4]='o';
		
//		String [] string= {"Jake","John","Michle"};
//		System.out.println(string[0]);
		//int y = Arrays.binarySearch(random, x);we can use for find element of step.
		          
//***********************************************************************************************	
//		                      Collections
//                            List:Important lists are ArrayList and LinkList	
		//There are many differences between ArrayList and LinkedList classes that are given below.
		/*1) ArrayList internally uses a dynamic array to store the elements.	*
		 * LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from 
the array, all the bits are shifted in memory.	
*Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list,
 so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.	
*LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.	
*LinkedList is better for manipulating data
*                               There difference List and Set
*  1)List allows duplicates while Set doesn’t allow duplicate elements. All the elements of a Set should be
*   unique if you try to insert the duplicate element in Set it would replace the existing value.
		
		 */
//	                          Array Listed	
//The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
//Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion,
//manipulation, and deletion.
		
		
		
		
	//ArrayList arrayList=new ArrayList();          //you have two way to crate ArrayList ,u can look left side first 2 lines 
//	List <String> arr=new ArrayList();              //if you put <>this symbol and wite primitive name,its mean Arraylist can contain just Strings
	                                                 
//	arr.add("Tom");                                //if you want add array,you have to use method number15,16      
//	arr.add("John");
//	System.out.println(arr.get(1).contains("n"));
//	System.out.println(arr.get(1).length());
//	System.out.println(arr.get(1).charAt(2));      //you can use all string mrthods on arraylist as like line number 17,18,19
//	System.out.println(arr.size());               //in Arraylist if wanna figure our length of ArrayList use size num20
//	arr.add(2,"Jess");
//	System.out.println(arr.contains("Jess"));    //if wanna check is there any array name of Jess u can use contain method num22
//	System.out.println(arr.remove(3));	          //if you wanna romove one of the arrays u can use method romove num23		
//	Collections.sort(arr);//8                    //usame tme u can use sort,its little bit diffirent tham Arrays,it is Collections num24		
		
//		                      LinkList
//		 java.util.List<Integer> list = new java.util.ArrayList<Integer>(); difirent sample to write List                     
//		List <String> list1=new LinkedList<String>();
//		LinkedList <String> list2 =new LinkedList<String>();
//		list2.add("A");
//		list2.add("B");//its same prosedure  to adding in LinkedList
//		list2.addFirst("C");//its fora adding object to first step
//		list2.addLast("D");//its fora adding object to last step
//		list2.add(2, "E");//its for adding object where you want,just need write which step,and object 
//		System.out.println(list2.peek());//its removing all object except first one
//		System.out.println(list2.poll());
//		list2.push("D");//its just adding the object fisrt step
//		list2.removeFirstOccurrence("D");//its removing first object
//		list2.remove("E");//removing object
//		Collections.reverse(list2);//reverse function LInkedLIst
//		System.out.println(list2);
//*********************************************************************************************
		
//		                             SET
//		Set <String> set=new HashSet<String>();//Set dont like duplicate...
//		set.add("Audi");//To add arguments same thing with List
//		set.add("Honda");
//		set.add("Ford");
//		set.add("Audi");
//		System.out.println(set.size());//Length of arguments same method to figure out
//		for (String string : set) {
//			System.out.println(string);
			
//		ArrayList<String>list=new ArrayList<>(Arrays.asList("A","B","F","B"));..If you have duplicate i wanna eliminate 
		//System.out.println(list); // it,u can import ArrayList to Set.Num 22 to way do that,2nd way is num 25 with each loop
//		Set <String> set1=new HashSet<String>(list);
//		System.out.println(set1);
		
//		for (String string : set1) {
//			set1.add(string);
//		}System.out.println(set1);
	//*****************************************************************************************
//                             MAP
		
//		Map <String,String> maps=new HashMap<String,String>();//if you want to use two String,u have specify that as like 
//		maps.put("firstName", "John");//this <String,String>.Or want to use STring,and Integer,write <String,Integer>
//		maps.put("lastName", "Smith");
//		maps.put("age", "35");
//		maps.put("salary", "10000");
//		System.out.println(maps);
//		System.out.println(maps.keySet());//With this way we can run out first Strings(keys)
//		System.out.println(maps.values());//with this we can run out second Strings(values)
//		String salaryMike=maps.get("salary");
//		System.out.println(Integer.valueOf(salaryMike)*12);//with this way u can import string to integer and use that.
//		Map <String,String> maps1=new HashMap<String,String>();
//		maps1.put("firstName", "Borden");
//		maps1.put("age", "45");
//		maps1.put("firstName", "Borden");
//		maps1.put("salary", "12000");
//		System.out.println(maps);
//		System.out.println(maps1);
	//	
//		ArrayList <Map> list=new ArrayList<Map>(Arrays.asList());
//		list.add(maps);
//		list.add(maps1);
//		System.out.println(list.get(0));
//		System.out.println(list.get(0).get("firstName"));
//		System.out.println(maps.get("firstName").charAt(0)+ "avid");
//		System.out.println(maps.containsValue("John"));
//*****************************************************************************************************		
	//	                    Iterate the collections(4 ways)
		
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
//		List<String> list = Arrays.asList("How", "To", "Iterate", "In", "Java");
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
 //                          Increments	
	
	//Increment operating
//			int i = 9;
//			i++;
//			System.out.println(i);// using increment o. every time when you put i++ ading one to initialized as 9+1  .
//			// Decrement operating
//			int f = 9;
//			f--;
//			System.out.println(f);// using decrement o.every time when you put f-- reduce one to initialized as 9-1
//			int num = 23;
//			System.out.println(num++); // when using increment o. as like this...nothing change...stop findin logic//
//			//its name is post incerement.If you want it is works as increment.you must to put ++ before .
//			int n =(int)3.9;
//		//   System.out.println("n ==" + n);
		
		
//		                      Primitives
	
//	boolean e = false;booleans- with this primitive keywords we can just right true or false
//	boolean a =true;
//	char vau = 'a';char- char consist of just one letter,it might be upper or lowercase.But not double letter.just one
//	byte eat= 1;
//	short qar = 2;
//	int  dolma = 3;
//	long ad = 4;
//	float sud= 6f;float numbers same thing as well.But end of the digits must to be leetr f 
//	double su = 6.5; double-you can write simple num as like int and hard number as like with point 6.5//because doublekeyword thinks 10 digit is not 10 integer ,it is 10.0 
	
                                    //Class Definitions
	
//1.Access modifitiers -public,private,protected,default;
//default --means no access m.if using that ,u can use that method just one package where situated thas class
//protected access m.means same thing with default,one differns in another package u have to extend to that class
//2.void-return type;
//
//3.main-name of the method;
//
//4.String[] args- parametr or arguments;
//
//5.Mathclass mt=new Mathclass();-This is an object instance of Mathclass;
//
//6.mt-variable instance;
//
//7. .(dot) -operator to call(invoke) method(function);
//
//8.return -type is string;



//access modifier         return type         nameOfTheMethod        placeForArgument
//public                void                 prientLength              ()  {
//here we put method body
//or implementation



//        Examples....






//mathClass math = new mathClass();     //1.Your class has to be same name with main class name.
//math.myFirstMethod();                 //2.Creating class (exm:mathClass <-) has to be between public main's curly braces
//  double d1=5;                      //3.Creating function has to be ending return/return meaning is act somthing.
//double d2=3;                          //4.If you want system out your function you have to use under your class where do you want.
//System.out.println();
//}
//
//public void myFirstMethod() {
//System.out.println("Hello everyone");
//
//}
//
//public double subDoubles(double d1, double d2) {
//
//return d1-d2;
//}
//
//public double Dobby(double d1, double d2) {
//double d = d1 * d2;
//return d;
//}
//
//public int instagram(int i1, int i2) {
//int i = i1 * i2;
//return i;
//}
//
//public float OnFloat(float f1, float f2) {
//float f = f1 / f2;
//return f;

	
//                                  While -continue and break

//		int i=0;
//		while(i<=5) {
//		System.out.println("i is greater than " + i);
//		i++;
//		if(i==3) {
//			break;//break means if i equals to 3 stop to work..
//			continue;//continue means if i is equals to 3 dont go to next step("alo"),go to first step!
//		}System.out.println("alo");
		
		//// when While begin work-if statement is true its going next line(sys.pr.),else its doesnt work
		 //when while beginning to work ,it is wont to stop.Because i is 0 ,it is not change ..and while accept it is true in first statement i<5
		//it is going second step systempr.and then back first statement .With i++ it will be going to i=0 and every time encriese one time 
		//when will be 5 it is stop.And this situation its have to print line 5 time .
		//While and forloop doing same thing,it is up to you which to use
	//***************************************************************************************************************
//                While increment an dPre-increment		
		
	//  Increment
//		 while(x++< 10) {System.out.print(x);};//1-10 
//		 while(x++<= 10) {System.out.print(x);};//1-11 
//		 while(x++< 10) {}System.out.print(x);//11
//		 while(x++<= 10) {}System.out.print(x);//12
		 
        //Pre-Incerement
//		 while(++x< 10) {System.out.print(x);};//1-9 
//		 while(++x<= 10) {System.out.print(x);};//1-10 
//		 while(++x< 10) {}System.out.print(x);//10
//		 while(++x<= 10) {}System.out.print(x);//11
	//}
		
	//	                      do While
//	do {
//		i++;
//		System.out.println("alo");
//	}while(i<=5);
	//difference while and do while:while first checking 1st statement if it is true its going next step,do while going next steps...at least one time
	//if its needs it continue to working
	
		}	
	
}
		



