package class_in_java;

public class Assigments {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int sum = num1 + num2;
		int num3 = 12;
//		 sum = sum + num3;
		 sum += num3 ;
		 // you have two ways to find the sum.It is first simple and the second with assigments .
//		 System.out.println(sum); assigments  sum += num3 means sum=sum+num3.it is easy way to find sum .
//		 sum +=num3;
		 System.out.println(sum);
		 // task sum1=8 num=9 print 17
		 int sum1 = 8;
		 int num = 9;
		 sum1 +=num;
		 System.out.println(sum1);
		 // new rull- java compile variables up to down...if you write num4=2 ,the num4=num4 + num5 java compile last equals num4 digit.
		 int num4 = 2;
		 int num5 = 6;
		 num4 = num4 + num5;
		 System.out.println(num4);//if you write num4=2 ,the num4=num4 + num5 java compile last num4 digit
		 num4 +=num5;
		 System.out.println(num4);
		System.out.println(11%3);// Same things happend other assigments minus,multiples .divided,you can find assigments on schedule.
		 // % is remeinder(translate to az -qaliq) exp 11%3 - it is means you must to divided 11/3 and remeinder(qaliq) is 2 
		 int r = 24%3;
		 System.out.println(r); // answer is 0.Because there is not remeinder(qaliq) when you divided 24 to 8 answer 3.no remeinder
		 // integer division 
		 int a = 13;
		 int b = 4;
		 System.out.println(a/b); // integer division you after divided your conclusion is 3.Because int division you
		 // dont need remeinders 
		 // double division
		 double c = 13;
			double d = 4 ;
			System.out.println(c/d);// compare to int with double division you conclusion will be 3.25 .
			
	}

}
