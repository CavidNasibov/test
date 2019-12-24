package encapsulationPack;

public class MethodOverloading {
public static void main(String[] args) {
	
	MethodOverloading m = new MethodOverloading ();
	m.addTwoNums(14,6);
	m.addTwoNums(14, 6);
	
}
	
	public void addTwoNums(int i,int j) {
		System.out.println("Sum of the two numbers is: " +(i + j)); //Overload meaning :you can write same object but difirent arguments
	}                                                                //in our instance one is int second is double
	
	public void addTwoNums(double i,int j) {                      //Polymorphism
		                                                             // Polymorphism is another OOP concept,# means many forms,real life it  
		System.out.println("Sum of the two numbers is: " +(i + j));	 // It is the ability of an object to take more than one forms 
		                                                          //as like you same person,but at market you customer,at work emloyeee,at home
		                                                             //parent.
		                                                             //Polymorphism is mainly divided into two types:
                                                                      ////Runtime polymorphism - overriding
                                                                     //Compile time polymorphism - OVERLOADING related to compile #;
                           
		
		
		//Example for "overriding" --- same method same parametr
		
		
//		class Dog{
//		    public void bark(){ same method #1
//		        System.out.println("woof "); same parametr #2
//		    }
//		}
//		class Hound extends Dog{
//		    public void sniff(){
//		        System.out.println("sniff ");
//		    }
//		 
//		    public void bark(){ same meyhod #1
//		        System.out.println("bowl"); sameparametr #2
//		    }
//		}
//		 
//		public class OverridingTest{
//		    public static void main(String [] args){
//		        Dog dog = new Hound();
//		        dog.bark();
		
		//Example for "overloading"======same method diffirent parametr
		
		
		 
		    //overloading method
//		   class Dog{
//		    public void bark(){ same method #1
//		        System.out.println("woof ");diffirent paramtr
//		    }
//		 
//		    //overloading method
//		    public void bark(int num){ same method #1
//		    	for(int i=0; i<num; i++)
//		    		System.out.println("woof ");
//		    }
	}
}
