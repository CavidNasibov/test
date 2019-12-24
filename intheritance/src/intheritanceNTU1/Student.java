package intheritanceNTU1;

public class Student extends Person {

	private String program="be smart";
	private int year=2;
	private double fee=3.5;

	public Student(String name, String address, String program, int year, double fee) {

		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public int getYear() {
		return year;
	}

	public double getFee() {
		return fee;
	}
	
	public void setProgram(String program) {
		this.program=program;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public String toString() {
		return "Student[Person[  name is "+ this.getName()  +" ,address: "+ this.getAddress()+ " ] "+ "program: " +this.program +" , year: "+ 
	this.year +" , fee: " + this.fee;
		
	}
	
	
	
	
	
	
	
	
	
	

}
