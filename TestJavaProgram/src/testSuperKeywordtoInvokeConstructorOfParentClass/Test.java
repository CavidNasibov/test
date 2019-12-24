package testSuperKeywordtoInvokeConstructorOfParentClass;

public class Test {

	public static void main(String args[]){
		/* Creating object using default constructor. This 
		 * will invoke child class constructor, which will 
		 * invoke parent class constructor
		 */
		Subclass obj= new Subclass(10);
		//Calling sub class method 
		obj.display();
		/* Creating second object using arg constructor
		 * it will invoke arg constructor of child class which will
		 * invoke no-arg constructor of parent class automatically 
		 */
		Subclass obj2= new Subclass();
		obj2.display();
	   }
	}
/*
 *                        conclusion
 *                        
 * When we create the object of sub class, the new keyword invokes the constructor of child class,
 * which implicitly invokes the constructor of parent class. So the order to execution when we create
 * the object of child class is: parent class constructor is executed first and then the child class 
 * constructor is executed. It happens because compiler itself adds super()(this invokes the no-arg 
 * constructor of parent class) as the first statement
 *  in the constructor of child class.        
 *                        
 */




