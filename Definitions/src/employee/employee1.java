package employee;

public class employee1 {

	private int id;
	private String firstName;
	private String lastName;
	private int Salary;
	public double percent;
	
	
	public employee1(int id,String firstName,String lastName,int Salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Salary=Salary;
		
	}
	public employee1() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int Salary) {
		this.Salary=Salary;
	}
	public int getAnnualSalary() {
		return 12*Salary;
	}
	public double raiseSalary(double persent,int Salary) {
		return persent*this.Salary /100 + this.Salary;
	}
	public String toString() {
		return this.id + "\n" + this.firstName + "\n" + this.lastName +"\n" + this.Salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean endsLy(String str){
     if(str.substring(str.length()-2).equals("ly"))    {
    	 return true;
     }else if (str.length()<2) {
    	 return false;
     }return false;
     }
	}
		

	
	

