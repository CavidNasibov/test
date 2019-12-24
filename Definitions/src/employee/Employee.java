package employee;

public class Employee {

	
	//instance variable
	public String fname;
	public String lname;
	public String hRate;
	public String hourWorked;
	public String timeFrame;
	
	//Method to print First and Last name
	
	public void printName() {
		System.out.println(fname + " " +lname);
	}
	
	public double totalSalary(double hrate,double hWorkedPerDay,String tFrame){
		//Worked 8 hours->Rate 60$
		
		switch (tFrame.toLowerCase()) {
		case "weekly":
			return hrate*hWorkedPerDay*5;
		case "biweekly":
			return hrate*hWorkedPerDay*10;
		case "yearly":
			return hrate*hWorkedPerDay*10*26;
			
		default:
			System.out.println("Wrong input:Please input weekly,biweekly or yearly");
		}
				
		
			return 0.0;
	}

	

	
}

