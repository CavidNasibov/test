package intheritancePoint;

public class Point3D extends Point2D {

	private float z = 0.0f;

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public Point3D() {

	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x,float y,float z) {
		this.z=z;
		setX(x);
		setY(y);
	}
	
		public float [] getXYZ() {
			
			float [] xyz= {getX(),getY(),this.z}; 
			return xyz;
	}
	public String toString() {
		return "( "+ getX() +" , " + getY()+ " , " +getZ()+" )";
		
	}

}
