package Tasks;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner str=new Scanner (System.in);
	
//        System.out.println("How is the weather");
//	     String i=str.nextLine();
//	      
//	      if(i.equals("raining")) {
//	    	 System.out.println("It is raining");
//	     }
//	     
//	     else if(i.equals("sunny")) {
//	    	 System.out.println("It is sunny");
//	     }
//	     else if(i.equals("snowing")) {
//	    	 System.out.println("It is snowing");
//	     }
//	     
//	     else { System.out.println("Go home");
	  //   }
//	     int num=50;
//	      System.out.println(41>num && num<58);     // && double ampersand likes false,if one condition is false output is false
	                                                //just one condition otput is true true&&Atrue
	 //     System.out.println(true && true);//output true    //you can use one & ampersand,but output will be same result,
	 //     System.out.println(false && true);//output false   //whats the matter,with & Java will look both conditions,if you put
	                                                        //two && ampersand if its false its doesnt check second.With two && we 
	   //   System.out.println(false && false);//output false   //just  save the time  .
	  //    System.out.println(true && false);//output false
	      
	      
//    System.out.println(true || true);output true      // || or or likes true ,if one condition is true output is true,jus tone 
//  System.out.println(false  || true);output true    // one condition is false false || false output false
//  System.out.println(true   || false);output true
//  System.out.println(false  || false);output false

//	      System.out.println("Please enter your grade");
//	      int r=str.nextInt();
//	      if (r==97) {
//	    	  System.out.println("A-");
//	      }
//	      else if (r<97 && r>=92) {
//	    	  System.out.println("A");
//	      }
//	      else if (r<97 && r>=89) {
//	    	  System.out.println("A+");
//	      }
//	      else  {
//	    	  System.out.println("You cant find grade");
//	      
//	      String light="red";    //it same thing with if else function,but with this you cant use boolean 
//	      switch(light) {         //if you want put switch combination quick just write "swi ctrl space enter"
//	      case "green":
//	    	  System.out.println("GO");
//	    	  break;
//	      case "red":
//	    	  System.out.println("STOP");
//	    	  break;
//	      case "yellow":
//	    	  System.out.println("prepare to go");
//	    	  break; 
//	    	  default: System.out.println("Call 911");
//	    	  
	    	  
//	    	  System.out.println("Put your gender please");
//	    	  String gender=str.nextLine();
//	    	  switch (gender) {
//			case "F":
//				System.out.println("Female");
//				break;
//             case "m":
// 				System.out.println("male");
// 				
//
//				break;
//             case "o":
//            	 System.out.println("others");
// 				break;
//			default: System.out.println("unkown");
//				break;
				
				
//				for (int i = 0; i < 10; i++) {
//				System.out.println(i);	
//	
//	System.out.println("Input pasword");
//	String pwd=str.nextLine();
//	String correcPwd="qwerty";
//	for (int i = 0; i < 2; i++) 
//		if (pwd.equals(correcPwd)) {
//			System.out.println("Well come");
//		}
//		 else {
//	System.out.println("Wrong password");
	
	
//	for (int i = 0; i < 10; i++) {
//		System.out.println(i);

//           System.out.println("Enter your age");
//	       int age=str.nextInt();
//	       if (age >=18) {
//			System.out.println("You can vote");
//		} else {
//           System.out.println("Not eligible");
//		}
//	       System.out.println("Put your number");
//          int length= str.nextInt();
//          int breadth=str.nextInt();
//          
//          if (length==breadth) {
//			System.out.println("It is square");
//		} else {
//        System.out.println("It is rectangle");
//		}
	         //Task3
//	System.out.println("Put number");
//             int first=str.nextInt();
//             int second=str.nextInt();
//              int third=str.nextInt();
//				
//              if (first>=second && first>=third) {
//				System.out.println(first + " is greatest"); 
//              }
//				else if (second>=first && second>=third) {
//					System.out.println(second + " is greatest");
//					
//			} else {
//              System.out.println(third +" is geatest");
//			}
			//write a  program to display
	//odd numbers up to users input
	//input =10 output:1,3,5,7,9
//          int number=20;
//	      for (int i = 0; i <= 20; i++) {
//			if(i%2!=0) {
//				System.out.print(i +",");
//			}
//		}
	//Prime number is divisible by 1 and itself without remainder
	//Prime number up to 20:1,2,3,5,7,9,11,13,15,17,19
//	              for (int i = 0; i < 20; i++) {
//					
//				}
	      
	               //write a program to check wheather a
	               //entered character is lowercase (a to z) or upperCase (A to Z)
	
//	                String S=str.nextLine();
//	
//	                char ch=S.charAt(0);//In order to get ASCII value for any letter type of letter should be char.
//	                //If you cast char to an int it will give the value from ASCII table EX:
//	                
//	                //Or you can assign char to int to get ASCII value
//	                int ch1=S.charAt(0);
//	                System.out.println((int)ch);
	
	 
//	                              String S=str.nextLine();
//	                              int ch1=S.charAt(0);
//	                              if (ch1>=65 && ch1<=90) {
//									System.out.println("Upper case");
//	                              }
//									else if (ch1>=97 && ch1<=122) {
//										System.out.println("lower case");
//									
//									
//								} else {
//                          System.out.println("not in the range");
//								}
	//write a program to calculate the sum of first 10 odd natural number.
//	                 int sum=0;     
//	                for (int i = 1; i <= 10; i++) {
//	                	sum+=i;
	                	//explanation
	                	//1.sum = 0 i = 1 sum will be 1
	                	//2.sum = 1 i = 2 sum will be 3
	                	//3.sum = 2 i = 3 sum will be 6
//	                	
//					}
//	                System.out.println(sum);
//	                     int sunOfOddNums=0;
//	                     for (int y = 0; y <=10; y++) {
//							if(y%2!=0) {
//								sunOfOddNums=sunOfOddNums+y;
//							}
//						}
//	                  System.out.println(sunOfOddNums);
	
	                 //Write a program to reserve a string
	                 //input:apple output:elppa
//	                  String str1="apple";
//	                   String reverse="";
	
	
//	             System.out.println("Enter your age please");
//	              int i=str.nextInt();
//	             if (i<18 && 0<i) {
//					System.out.println("you can not vote");
//	             }
//	             else if(i<0) {
//	            	 System.out.println("PLease enter valid number");
//									} else {
//                   System.out.println("Yor are  eligible");
//				}
//	             
//	             System.out.println("Please  put length");
//	             int length=str.nextInt();
//	             System.out.println("Please  put bridth");
//	             int bridth=str.nextInt();
//	             if (length==bridth) {
//					System.out.println("It is square");
//				} else {
//                   System.out.println("It is rectangle");
//				}
//	             
//	             System.out.println("Enter number");
//	            int number1=str.nextInt();
//	            int number2=str.nextInt();
//	            int number3=str.nextInt();
//	            if (number1>=number2 && number1>=number3) {
//		System.out.println(number1 + " is greatest");
//	            }
//	            else if (number2>=number1 && number2>=number3) {
//			System.out.println(number2 + " is greatest");
//		        }
//	            else  if (number3>=number2 && number3>=number1) {
//				System.out.println(number3 + " is greatest");
		
//	            System.out.println("What is the day today?");
//	             int n1=str.nextInt();
//	             if (n1==1) {
//					System.out.println("Today is Monday");}
//	             else if (n1==2) {
//						System.out.println("Today is Tuesday");}
//	              else  if (n1==3) {
//						System.out.println("Today is Wensday");}
//	             else  if (n1==4) {
//						System.out.println("Today is Thursday");}
//	             else if (n1==5) {
//						System.out.println("Today is Friday");}
//	             else if (n1==6) {
//						System.out.println("Today is Saturday");}
//	             else if (n1==7) {
//						System.out.println("Today is Sunday");}
					
//	                   System.out.println("Whatis the day today");
//
//               int day = str.nextInt();
//					switch (day) {
//					case 1:
//						System.out.println("Monday");
//						break;
//					case 2:
//						System.out.println("Tuesday");
//						break;
//					default:System.out.println("enter correct day");
//						break;
	 
//          String a="monkey";
//          for (int i = a.length()-1; i>=0; i--) {
//        	  System.out.print(a.charAt(i));
//		}
//          int y=a.length()-1;
//          while(y>=0) {
//        	  System.out.print(a.charAt(y));
//        	  y--;
//          }          
      // Find midle letter of the word
	//exp monkey middle letters nk || monkeys middle letter is k 
//           String s="Monskey";
//         int x=s.length()-1;
//         
////         if(x%2==0) {
////        	 System.out.println(s.subSequence(x/2-1, x/2+1));
////		}
////         else {
////        	 System.out.println(s.charAt(x/2)) ;
//        	 System.out.println(s.lastIndexOf(s.length()-1));
	
	         // String s="Monkey";
////	          int y= s.length()-1;
////	          while(y>=0) {
////	        	  
////	        	  System.out.print(s.charAt(y));
////	        	  y--;
////	          }
////	          
//	          int y=0;
//	          String s="Azerbaijan";
//	          while(y<=s.length()-1) {
//	        	  System.out.print(s.charAt(y));
////				System.out.print(y);
//				y++;
//			}
//	int i=0;
//	String s="Azerbaijan";
//	while(i<=9) {
//		System.out.print(s.charAt(i));//this out give us letters
//		System.out.print(i);//this out give to us index of letters.if you remove this out .You can see letters of str
//		i++; 
//         }
//	
//	String s="America";
//	
//	//aouie
//	for (int i =0; i <=s.length()-1; i++)
//{     s= s.toLowerCase();
//
//		if (s.charAt(i)!='a' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='i' && s.charAt(i)!='e' ) {
//			System.out.print(s.charAt(i));
//			System.out.print(" ");
//		}
//	           String s="123445600";
//	           int i=s.length()-1;
//	           while(i>=0) {
//	        	   System.out.print(s.charAt(i));
//	        	   i--;
//}
	        
				
//				int s=1234500;
//				String x=s +"";
//			
//				for (int i =x.length()-1; i>=0; i--) {
//					System.out.print(x.charAt(i));
//					
//					
////			        }
//	int s=1234500;
//	String x=s +"";
//	for (int i =x.length()-1; i>=0; i--) {
//		System.out.print(x.charAt(i));
//	int x=123450;
//	int y=0;
//	while(x>0) {
//		y=y*10+x%10;
//		x=x/10;
//		
//}	
//System.out.println(y);
	
	String  [] daysOfWeek=new String[7];
	   daysOfWeek [0] ="Monday";
	daysOfWeek [1] ="Tuesday";
	daysOfWeek [2] ="Wensday";
	daysOfWeek [3] ="Thursday";
	daysOfWeek [4] ="Friday";
	daysOfWeek [5] ="Saturday";
	daysOfWeek [6] ="Sunday";
//	   System.out.println("monday");
	 for (int i = 0; i < daysOfWeek.length; i++) {
		 System.out.println(daysOfWeek [i].charAt(0));
//		if (daysOfWeek[i].equals("Sunday") || daysOfWeek[i].equals("Saturday"))
//		{
//			System.out.println("It is weekend");
			
		}
	}
	
	}
	




					
					
                       
					
					
					
					
	
					
					
					
				
                   

	
	
	

	
	

	             
	          




