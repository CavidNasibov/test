package employee;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter First and Lasname");
          
          Employee emp=new Employee();
          emp.fname=sc.nextLine();
          emp.lname=sc.nextLine();
          System.out.println("Enter hRate,hWorkedperDay.and tFrame");
          double rate=sc.nextDouble();
          double hours=sc.nextDouble();
          String time=sc.next();
          
          emp.printName();
          double totalSlary= emp.totalSalary(rate, hours, time);
          System.out.println( "Yours " + time +" salary is:$ " +  totalSlary);
          
          
	}

}
