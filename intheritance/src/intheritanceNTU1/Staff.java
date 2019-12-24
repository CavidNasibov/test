package intheritanceNTU1;

public class Staff extends Person {

	private String school="Salem Soul";
	private double pay=1000.0;
	
	public Staff(String name,String address,String school,double pay) {
		super(name,address);
		this.school=school;
		this.pay=pay;
		
	}
	public String getSchool() {
		return school;
	}
	public double getPay() {
		return pay;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public String toString() {
		return "Staff[ "+ getName()  +" , "+ getAddress()+ " ] "+ this.school +" , "+ this.pay ; 
	}
}
