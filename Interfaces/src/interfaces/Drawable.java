package interfaces;

public interface Drawable {

//	public abstract void draw();   
	
	//All variables are public,static and final
	void draw();
	public static final int I=9;
	
	default void m() {
		System.out.println("I am default method in interface");
	}
	
	static void s() {
	System.out.println("I am static method in interface"); 
	}
	
	class Circle implements Drawable {
		
	

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
		
	}
}
}