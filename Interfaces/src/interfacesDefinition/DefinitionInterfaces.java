package interfacesDefinition;

public interface DefinitionInterfaces {

	// https://www.w3schools.com/java/ref_keyword_implements.asp
	// https://www.tutorialspoint.com/java/java_interfaces.htm
	
    //Interface can have only abstract methods
	// An interface is a reference type in Java. It is similar to class. It is a
	// collection of abstract methods.
	// You have write "word interface " instead word" class" above,as public
	// interface "interfaceName";
	// All interface methods would be public abstract,even it is not appear,it is means
	// default but it has.saying on e word u can use 2 ways,as below
	// public abstract void car(double speed);
	void car(double speed);

	void car1();

	void car2();
	// We can create new class and extend to interface class(DefinitionInterfaces)
	// ,but ininterface it is not extend--it calls implement
    //U can see on class DefinitionInterfaces2.  And again same things it wont compile and u must to call overide as extending//look-->DefinitionInterfaces2
    //U can extend class just for one class ,but with implement u can implement class multi interfaces. look class -->bmw
	//Abstractor A can extend abstractor B  ;
    // interface A can extend interface B...If class implements A interface its means that class already implimented B interface same time..
    //if abstract class implimented interface  ,its not important override..Because in future which class will want to extand that abstract
	//that class can be override that methods
	// Interface has only static and final variables
	
	                //About final method
	// in interface variable always is "public static final".
	//"Final" means :if you want nobody can change variable value in any classes ,that time u can use final...
	//if you want any method cant be overriding ,declare that method to "final"
	//if you want any class cant be extending ,declare that class to "final"  ;
	
	
	
	
	
	
	
}
