package exceptionPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*9:00 ->   10:10        exceptions
 * 10:20->   10:37           continue with exceptions
 * 10:38->     10:53      throw exception
 * 10:53 ->                  selenium   12:04 -> go to Selenium project             
 * contribute all of them
 * 
 * 
 */
public class exceptionClass {
	public static void main(String[] args)  {
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
		 */
		
	}

}
