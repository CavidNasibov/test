package stringPackage;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
		 Scanner str=new Scanner (System.in);
		System.out.println(str.getClass().getName()); 
//		
//		int number  =10;
//		String word = "Hello World";
//		System.out.println(word.charAt(1) );//     1. By this function which number you will write between the parentesis ,
////		Java will run that Letter.Java always  starts by zero.and because if you have wrtitten 1 it will show you letter e .
//		String sign = "!";
//		System.out.println(word + sign);           2.// This function is called "concatenation"
//		word = word + sign;
//		System.out.println(word + number);
//		System.out.println(""+2 + 4 );             3.//if you will write after double quotes + number + number ..they just combine
//		// (""+2+4) its - 24 
//		System.out.println(word.substring(5));//   4. by this function you can write index(digit) ,java will run all letters after than
//		// letter which number suits .if you have 5 ,it will be World.Because 5 is space /
//		System.out.println(word.substring(2,7));//     5. If we write two nums ,its mean java run between that letters /
//		System.out.println(word.length());//           6.if we want to know how many charachters(letters) on that object,we have to use this function
//        System.out.println(word.indexOf("l"));//       7.this function helps to us define index of the letter.We put l its 2 /
//		/////////        Hello World    /////////////
//		           //    012345678910 
//        System.out.println(word.indexOf("o" , 5));//       8.using this func.we can realize whic index is seconf  letter "o"//
//        //just write next index of the first letter "o"  /
//        System.out.println(word.lastIndexOf("l"));
//        
//        String str ="Java";
////        str += " is cool";
////        System.out.println(str); //string is immutable
//        System.out.println(str += " is cool");//if you want to change str ,you have to variable(Strings) += "somthing",
//        // or variable=variable +"something
//        System.out.println(str );
////        
//        String string = "My car";
//                System.out.println(string += " is blue ");
//        System.out.println(string );
////        
//        
        
//        String country="Portugal";
//        country=country.toUpperCase();
//        System.out.println(country);
//        
//        System.out.println("Length of String is" + country.length());
//        System.out.println("Index of String is" + country.indexOf('l'));
//        
////        
//        String str1="ALPS_CHECKING_SERVICE_FIRSTNAME";//this String function you can find which charachter you want.doesnt matter 
//        //if in future will change variables(str1) argument("ALPS_CHECKING_SERVICE_FIRSTNAME")
//        int i = str1.indexOf("FIRSTNAME");
//        System.out.println(str1.substring(i));
//       int r =str1.indexOf("FIRSTNAME");
//        System.out.println(str1.substring(r));
        
      //USe String with scanner(input) methods and more other options
        
//        String s=str.nextLine();
//        System.out.println(s);
                               //    Task important 
        //input string on the keyboard
        //input one letter of string
        //exp 'apple' then one letter  'l' 
		//then output should be 'l is 4th letter '
//         System.out.println("Please enter a word");
//          String S =  str.nextLine();
//          System.out.println("Show me Letter");
//          String R=str.nextLine();
//           int Q=S.indexOf(R)+1;
//		System.out.println(R + " is " + Q+"th" + " letter");
		  
		 
		 
//		       System.out.println("Show me word");
//		       
//		                      String S = str.nextLine ();
//            System.out.println(S);
//                
//                
//                
//                
//                
//                
//        		String T=S.toUpperCase();
//                System.out.println(T);
//                System.out.println(S.indexOf('b'));
// 		        System.out.println(S.subSequence(2, 4));//    9.with this func.can take word between the numbers which suits to letters
//                String R=S.substring(0);
//        System.out.println(R);
//        System.out.println(S.equals(T));//             10.with this func.we can compare to two object.but  letter of the word 
//        System.out.println(S.equalsIgnoreCase(R));//     11.with this func.we can compare to two object.just count object of the numbers or letters
//        System.out.println(S.startsWith("AZ"));//         12.w.t.f.we can check is it start this word which one we show
		                                                     //10,11,12  and 14 positions shows boolean response.true or false
//        Boolean x =S.startsWith("Az");
//        System.out.println(x);
//      int y=S.lastIndexOf('a');//          13.w.t.f.we can figure out of last  letter's whic we will ask 
//     System.out.println(y);
//       boolean Q=S.contains("jani");//        14.w.t.f.we can f.o.does it contains this combination or not
//        System.out.println(Q);
		 
		// Math strings
//        System.out.println(Math.sqrt(64));     15.//w.t.f.we can change number square root.exp 64=8 81=9
                
//          System.out.println(Math.pow(2,6));//       16.when we use this function  2 is multipling 6 times 2x2x2x2x2x2=64
//          System.out.println((int)Math.pow(2,6));//    17.if we want put out whole number ,must to casting as int
		 
//		 String w= "Letter";
//		 System.out.println(w.charAt(0));
//		 System.out.println(w.lastIndexOf('t'));
//		 
//		 System.out.println(w.indexOf('L'));
//		 System.out.println(w.charAt(0));
//		System.out.println( w.length()-1);
//		 
//		 System.out.println(w.charAt(w.length()-1));//      18.This formula help to us find the letter of the word.doesnt 
//		                                            //      matter how long this word or will change in future
//		 String c = "Table";
//		System.out.println( c.charAt(c.length()/2));//   19.w.t.f.we can find middle letter .But this formula works 
		                                              //just "Odd numbers"
////		 
		 String x="Monkey";
////		 System.out.println(x.substring(x.length()));
////		 
////		 System.out.println(x.substring(x.length()/2-1, x.length()/2+1));// 20.w.t.f.we can find middle letter .But this 
////		                                                                  formula works just "Even numbers"
//		 
//
//		 System.out.println(x.length()%2);//w.t.f.w.c.f.o.it is odd number or even number.if print out 0 its means even num.
//		                                   //if it difirent than 0 it means odd number.We just a divided length of word 2 
//		                                    //and if there is not reminder its even number.
//		 
		 
		 if( x.length()%2 == 0)               {// if reminder equals to zero
			 System.out.println(x.substring(x.length()/2-1, x.length()/2+1)); //let works this position
		 }  
		 else //if reminder doesnt equals to zero  { 
			 System.out.println( x.charAt(x.length()/2));//let works this position
		 //conclusion .you can change word push enter its show you middle letter doesnt matter it is even or odd number 
		 //count of letters
		 }
	
		 
		 
//        
	}
	 
