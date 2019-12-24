package encapsulationPack;

public class constractor {
private String month;
private int  date;
private int year;

//public constructor(String m, int d,int y) {   //Constructor:
	       //  month=m;                          //#'s variable name is should be exact same with class name
	                                          //cobstractor doesnt need return type and return as well
	                                          //must to create method and give name then use.Look -->> "testOfConstractorClass"
	       //  date=d;                      //without constructor we cant use methods which we create in class
	        // year=y;                               
//}


public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}


	

	
	



}
