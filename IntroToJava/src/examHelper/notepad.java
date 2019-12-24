package examHelper;

import java.time.LocalDate;
import java.time.Month;



public class notepad {
public static void main(String[] args) {
 
	{
	 
//	                        Chapter:1
	
/*1.Valid javad identifaers rules//exam question num1
 * 1.Java identifiers are case-sensitive
 * 2.Reserved Words can’t be used as an identifier,exp:String,true,false,null.There are 53 reserved(blocks) words
 * 3.Identifiers should not start with digits([0-9]). For example “123geeks” 
 * 4.the dot (.) is not allowed in identifiers
 * 5.The only allowed characters:([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).
 * 
 * 2.Primitives do not allow methods to be called on them//exam question num3
 * short numPets = 5;
     int numGrains = 5.6;
     numGrains.length(); it is error
     numPets.length();compiles error as well ,because both of them are primitives.They are not class.
   3.
   
   public class notepad {
	
       String result="done";-compile
	 public void shed(boolean time) {
		 String result="done";-compile
	if (time) {
		String result="done";-not compile
	}
	 System.out.println(result);
	 String result="done";-not compile
	 }
     int a, b, c;         // Declares three ints, a, b, and c.decleration
     int a = 10, b = 10;  // Example of initialization
 There are three kinds of variables in Java −

*Local variables--   are declared in methods, constructors, or blocksA local variable is a 
variable defi ned within a method. Local variables must be initialized
before use. They do not have a default value and contain garbage data until initialized.
*Instance variables--Instance variables are declared in a class, but outside a method, constructor or any block.
*Class/Static variables
*
     4.
     Wildcard only for classes (Java.util.*).We cant use for packages 	import aquarium.*.Jelly doesnt work
     
     5.Which coditions will compile "main" method
     public static void main(String[] args)
     public static void main(String[] name) desnt matter which letter u writes here it compile
     public static void main(String[] _name) it is compile with underscore or $ dollar sign
     public static void main(String[] 1name) it is not compile if begins numbers
     public static void main(String... args)it is work with VAR arguments
     
     5.
     	public static void main(String[] args) ->it isa canonical main() method signature. You need to memorize it.
     	Main method must to be as like this ..It is cant be private,without void or something else..
     	
     6.
     Instance variables can get assigned default values.But Local cant be.
     All non-primitive values default to null(exp String),
     Primitives values default 0.
     Double and Float primitives values default are 0.0;
     	
     7.
     Local variables do not get assigned default values.
      The code fails to compile if a local variable is not explicitly initialized.
      
     8.
     When u writes value to variables u can use underscore.Underscores are allowed as
      long as they are directly between two other digits 	                int i1 = 1_234;.
      It is incorrect if underscore is adjacent to the decimal point double d1 = 1_234_.0;
      It is incorrect if the underscore is the last character.              double d3 = 1_234.0_;
       
     9.  
      int amount = 0b101;//0b is the prefix for a binary value and is correct
//		int amount = 0xE;//0X is the prefix for a hexadecimal value
//		double amount = 0xE;//This value can be assigned to many primitive types, including int and double
//			long amount = 9L;//9L is a long value. long amount = 9L would be allowed.
 * 
 *   10.Location of package,class and import
 *   "Package" and "import" are both optional. If both are present, 
 *   the order must be package, then import, then class.
 *   
 *   11.Garbage Collection begin to works when object is null.
 *   Garbage collection calling with this structure-> System.gc();
 *   It is not mean if we put this structure and garbage coillection begins to work,GC begins to work after null!
 *   
 *   12.It is Trenary 
 *   If you want assign to String your options has to be String,not false.in this case it will not to compile
 *   String message = x > 10 ? "Greater than" : false; 
 *   
 *                    It is difirent type og Ternury operator
 *    int x = 5;
		 ystem.out.println(x > 2 ?"x < 4 ? 10 : 8"  : 7);first cut this place between quotes.The quotes put myself,
		 normally it isnt
		 System.out.println(x > 2 ?  : 7)
		"x < 4 ? 10 : 8" and then figure out what is the answer this Format ,answer false and means 8;
		 System.out.println(x > 2 ? 8 : 7)then go back ,put 8 and check what is answer.Answer true and means 8;
 *   
 *   13.The code does not compile because two else statements cannot be chained together
        without addition if-then statements
        int x = 4;
        long y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        else System.out.println("Too High");
      14.
      
		int x = 5 * 4 % 3;
		 System.out.println(x);
		 output will be 2,because "modulo %" work as getting reminder
		 
	  15. 
	 int c = 7;
	 int result = 4;
	 result += ++c;  U can write result=result +++c;and it is compile by 3 plus;and output will 12
	 System.out.println(result);because result is for and when occur third line c pre-incerement to 8.
	 
	  16.While will stop when is m smaller than n.It will be happent 3 times and anser is 26.
	  1st itteration x is 11,2nd is 23,3rd is 36.And then m will be 5>7 and n is 7 and while loop will terminate
	  3: int m = 9, n = 1, x = 0;
          while(m > n) {
          m--;
          n += 2;
          x += m + n;
       }
      System.out.println(x);
      
      17.Primitives
      example
      int in=5;
      int i=3;
      ___ x=5+3;you can use primitives more memores than int or same;As can we see in schedule we cab use int,short and byte
      exceptions:"byte" doesnt accept "short"and "byte",'short' doesnt accept 'short it has to be more than short.
      
byte	8		 byte b = 100;
short	16		short s = 30_000;
int	    32		      int i = 100_000_000;
long	64		 long l = 100_000_000_000_000;
float	32		float f = 1.456f;
double	64	   double f = 1.456789012345678;
char	16		 char c = ‘c';
boolean  1       boolean  true;

       
       18.
       int d=5;
		int s=d%10;
		if number is less than second number which you want to divide ,reminder every time is first number

       19.
       AND    Inclusive   Exclusive
     andand   oror        caret
       &        |           ^ 
    T-T=T     T-T=T       T-T=F
    F-F=F     F-F=F       F-F=F
    T-F=F     T-F=T       T-F=T
    F-T=F     F-T=T       F-T=T
Like false    Like T      diffirense are True,equlas are False

      20.
      Do while loop
      do {
			 int y = 1;It is not correct and wont compile.Because you have to declare outside of body
			 System.out.print(y++ + " ");
			 } while(y <= 10);

      21.
      int numFish = 4;
		 String fishType = "tuna";
		String anotherFish = numFish + 1+"";
		 System.out.println(anotherFish );
		 	 As can we see line 186 we tying to store  string and integer together.In this case,if we add ""end
		 of statement it will be work and pay attention answer is 4+1=5;But if we add string another place 
		 fornt of statement or middle of statement.It will be concatinate.Be carefull!
		 
	  22.Look line 193 ,there is s and Hello same thing,u can use both of them.On line 194 we put s inside constractor
	  parenteses and it will be work.If we print t,it will be show us value of line 193 "Hello";
	  == - compare 2 source.If we compare s == "Hello" it is true because they are same source.
	  But if we compare s==t ot "Hello"==t its compile but not work,because diffirent source.
	  equals - this func.compare two words.Its means if we compare s.equals.(Hello) or t.equals(s)  it is work.Because
     same word .
     
	   String s = "Hello";
	String t = new String(s);
	 if ("Hello".equals(s)) 
	System.out.println("one");//one three four
	 if (t == s) 
	System.out.println("two");
	 if (t.equals(s)) 
	System.out.println("three");
	 if ("Hello" == s) 
		 System.out.println("four");
	 if ("Hello" == t)
		 System.out.println("five");; 
   
      23.
      String - immutable;
      StringBuilder -mutable,u can mutated with method append.
      StringBuffer - mutable.
      An immutable object cannot be modified.
      An immutable object can be garbage collected.
     
      24.
      Java does not allow you to compare String and StringBuilder using ==
      
      25.
        int[][] scores = new int[3][];       Legal-at least right hand first brace must to be number.Not in second.
		Object[][][] cubbies = new Object[1][][];          Legal
		java.util.Date[] dates[] = new java.util.Date[2][];Legal
		
		String [] = new String[6];Illegal  -We cannaot use varibale name right hand.it has to be String
		int[][] types = new int[];Illegal  -both of side had to be same square brace
		int[][] java = new int[][];Illegal -beacuse at least on right hand first brace has to be number
      
      26.
      1.An array has a fixed size.
      2.An array allows multiple dimensions.
      3.An array is ordered.
      4.An ArrayList is ordered.
      5.Array and ArrayList are mutable.
      
      6.Two arrays with the same content are not equal.
      7.Two ArrayLists with the same content are equal.
      8.
      
      27.??????
       ages.add(Integer.parseInt("5"));
       ages.add(Integer.valueOf("6"));
       
      28.you have two ways spacify date
      LocalDate date =	LocalDate.of(2014, Month.JUNE, 21); Legal
      LocalDate date =LocalDate.of(2014, 6, 21);   Legal
      
      
      LocalDate date =new LocalDate(2014, 6, 21);Illegal -you cant use this way
      LocalDate does not have a time element,u can not write -date.plusHours(3);it is illegal
      date.plusDays();date.getYear(); date.getMonth(); date.getDayOfMonth() -are legal
      
    ************************************************************************************************   
       
       	/*
		 * Examples of Built-in Exception:

                  Arithmetic exception
		 * 
		 * // 1.Java program to demonstrate *ArithmeticException* 
class ArithmeticException_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            int a = 30, b = 0; 
            int c = a/b;   cannot divide by zero 
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 
    } 
		 *            2.NullPointer Exception
		 * 
		 * //Java program to demonstrate *NullPointerException* 
class NullPointer_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = null; //null value 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException.."); 
        } 
    } 
		 *             3.StringIndexOutOfBound Exception
		 * 
		 * // Java program to demonstrate *StringIndexOutOfBoundsException *
class StringIndexOutOfBound_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = "This is like chipping "; // length is 22 
            char c = a.charAt(24); // accessing 25th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
		 *      4.FileNotFound Exception
		 *      
		 *      //Java program to demonstrate *FileNotFoundException *
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
 class File_notFound_Demo { 
  
    public static void main(String args[])  { 
        try { 
  
            // Following file does not exist 
            File file = new File("E://file.txt"); 
  
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist"); 
        } 
        
                5.NumberFormat Exception
		 * // Java program to demonstrate * NumberFormatException *
class  NumberFormat_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            // "akki" is not a number 
            int num = Integer.parseInt ("akki") ; 
  
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
    }                6. ArrayIndexOutOfBounds Exception
		 * // Java program to demonstrate ArrayIndexOutOfBoundException 
class ArrayIndexOutOfBound_Demo 
{ 
    public static void main(String args[]) 
    { 
        try{ 
            int a[] = new int[5]; 
            a[6] = 9; // accessing 7th element in an array of 
                      // size 5 
        } 
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println ("Array Index is Out Of Bounds"); 
            
            
            
        } 
        
    } 
    
        29.
           Java offers four choices of access modifier:

Modifier	Meaning
public	    The method can be called from any class.
private	    The method can only be called from within the same class.
protected	The method can only be called from classes in the same package or subclasses.
Default 	The method can only be called from classes in the same package.
            There is no keyword for default access. Just omit the access modifier.
 
        30.
        Optional the optional specifiers
        
        myMethod3() and myMethod4() are valid method declarations with both final and static as optional specifiers. 
        The order of these two keywords doesn't matter.
         1.public static final void myMethod3() {}  
           public final static void myMethod4() {}
         2.public void final myMethod6() {} // DOES NOT COMPILE 
         3.myMethod7() does compile. Java allows the optional specifiers to appear before the access modifier.
           final public void myMethod7() {} 
         4.public void myMethod1() {}
         5.public final void myMethod2() {}
         
         31.
         1.public void moreA(int... nums) {} compile 

         2.public void moreB(String values, int... nums) {}    compile
         3.	public void moreC(int... nums, String values) {} vararg parameter must to be last
         4.public void moreD(String... values, int... nums) {} vararg parameter must to be one
         
         32.Chapter 4/ Q11
          public class Rope { 
	public static void swing() {
 System.out.print("swing ");
 } public void climb() {
 System.out.println("climb ");
 }
 public static void play() {
 swing();
 climb();error here ,because on line 409 we must to add static,thats why swing() works.
 }u can create method inside of meyhod.But using static is compulsory
 public static void main(String[] args) {
 Rope rope = new Rope();
 rope.play();
 Rope rope2 = null;
 rope2.play();
 rope.play();
 
 https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/
       *Static method can access to non-static method,but non-static method can not access to static method.
       *Static final variables u can use once.Otherwise it does not compile.
       *If you create static variable u have to use inside of static blocks.Otherwise does not compile.
       
 }
 }
         
                               static import
         Static import allows you to access the static member of a class directly without using the 
         fully qualified name.
         Static imports are used for saving your time by making you type less. If you hate to type
          same thing again and again then you may find such imports interesting.                       
         
        * Normal codding *               
         
         class Demo1{                              | import static java.lang.System.out;                     
   public static void main(String args[])          |import static java.lang.Math.*;
   {                                               |class Demo2{
      double var1= Math.sqrt(5.0);                 | public static void main(String args[])
      double var2= Math.tan(30);                   | {
      System.out.println("Square of 5 is:"+ var1); | //instead of Math.sqrt need to use only sqrt
      System.out.println("Tan of 30 is:"+ var2);   |   double var1= sqrt(5.0)
                                                   |  //instead of Math.tan need to use only tan
   }                                                  double var2= tan(30);
}                                                      //need not to use System in both the below statements
                                                        out.println("Square of 5 is:"+var1);
                                                        out.println("Tan of 30 is:"+var2);
If you are going to use static variables and methods a lot then it’s fine to use static imports.
 for example if you wanna write a code with lot of mathematical calculations then you may want to use static import
                
                                            Autoboxing and Unboxing
             
             Prymitive  type           Wrapping class
            * boolean                  Boolean
            * byte                     Byte
            * char                     Character
            * float                    Float
            * int                      Integer
            * long                     Long
            * short                    Short
            * double                   Double
            
             
       Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called
        autoboxing. For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:                                                                                        
                                                              
          *Passed as a parameter to a method that expects an object of the corresponding wrapper class.
          *Assigned to a variable of the corresponding wrapper class. 
                                                           
               import java.io.*; 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
        // creating an Integer Object 
        // with value 10. 
        Integer i = new Integer(10); 
  
        // unboxing the Object 
        int i1 = i; 
  
        System.out.println("Value of i: " + i); 
        System.out.println("Value of i1: " + i1); 
       
       Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
        For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:

         *Passed as a parameter to a method that expects a value of the corresponding primitive type.
         *Assigned to a variable of the corresponding primitive type                                               
            
             //Autoboxing of char 
        Character gfg = 'a'; 
  
        // Auto-unboxing of Character 
        char ch = gfg; 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of gfg: " + gfg); 
                                                    
                                                              
                                                              
         
 
		 */
       
       

	 
	}	
	
}

	 
}

