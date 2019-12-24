package encapsulationPack;

public class encapsulations {             //Encapsulation in Java
//Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
	//In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

//To achieve encapsulation in Java 

//Declare the variables of a class as private.

//Provide public setter and getter methods to modify and view the variables values
	//Access modifiers:public,private,protected,default
	public String str;                              //if you put nothing front of the return type it is meaning default;
	private String str1="Encapsulation";//private access mod. using for:nobody can use this instance
	                                          
	//Mutators or getters and setters         
	public String str1() {         //For a using private method has one way with called getter:You need  create new public same instance and  variable
		return str1;                          // and return to that variable
		                            // then create object name of where is 
                                       //your private instance situated and then invoke this method.The thing is you just use value of the 
		                              //private method.But u cant change value!
		
	}
	 public String setStr(String st) {   //For a change value of the private method has one way with called setter:You need create 
		 str1=st;                                    //new public as left side but must to write argument as instance and variable of argument
		 return str1;                                   //(String string); Then we need to write variable equals to argument(str1=string)
	 }                                      //then return to variable.Creat object as getting mutator and called..now u can change name
		 public String getStr()   {
			 return str1;                              //shorcut to crate getter and setter:go to source -> generate getter and setter ->
		 }
		                                      // choose variable which u need and pick option (getter or setter) and generate
		 
	
	 public static void main(String[] args) {        
		 encapsulations encap=new encapsulations();              
		 System.out.println(encap.getStr());
		 System.out.println(encap.setStr("duma"));
	}
}
