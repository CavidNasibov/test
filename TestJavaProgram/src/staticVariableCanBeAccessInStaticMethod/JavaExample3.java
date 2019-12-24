package staticVariableCanBeAccessInStaticMethod;

class JavaExample3{
	  static int var;
	  String var2;
	  //This is a Static Method
	   void disp(){
	      System.out.println("Var1 is: "+var);
	      System.out.println("Var2 is: "+var2);
	  }
	  public  static void main(String args[]) 
	  {
		  JavaExample3 a=new JavaExample3();
		  a.disp();
		  
	  }
	}
