package testSuperKeywordtoInvokeConstructorOfParentClass;

class Subclass extends Parentclass
{
   Subclass(){
	/* Compile implicitly adds super() here as the
	 *  first statement of this constructor.
	 */
	System.out.println("Constructor of child class");
   }
   Subclass(int num){
	/* Even though it is a parameterized constructor.
	 * The compiler still adds the no-arg super() here
	 */
	System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
}