package employee;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		//r1.setLength(9.0f);
		//System.out.println(r1.getLength());
		System.out.println(r1.getLength());
		Rectangle r3=new Rectangle ();
		Rectangle r4=new Rectangle ();
		System.out.println(r1.getWidth());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		Rectangle r2=new Rectangle(4.0f,5.0f);
		System.out.println(r1.toString());
		//System.out.println(r2.getLength());

		
		
		
		
		Rectangle [] rectangles= {r1,r2,r3,r4};
		float temp=0;
		int p=0;
		float  [] lengths = {rectangles.length};
		for (int i = 0; i < lengths.length; i++) {
			float l=rectangles[i].getLength();
			if(temp<l) {
				temp=l;
				p=i;
				
				//i=0 ; temp = 0;l = 1 -> temp=1; p=0;
				//i=1 ; temp = 1;l = 4 -> temp=4; p=1;
				//i=2 ; temp = 4;l = 3 -> temp=4; p=1;
				//i=3 ; temp = 4;l = 7 -> temp=7; p=3;
				
			}
			
			
			
		}System.out.println(rectangles[p].toString());
		
		
		//String [] array= {"John", "Mike" , "Tom", "William"};
//		for (int i = 0; i < rectangles.length; i++) {
//			System.out.println(rectangles[i].toString());
		}
		
	}

