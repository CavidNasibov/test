package abstractionNTU1;

public abstract class Shape1 {
	protected String color;
	protected boolean filled;
	
	public Shape1() {
		
	}
	public Shape1(String color,boolean filled) {
		this.color=color;
		this.filled=filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public boolean isFilled() {
		return filled;
	}

	public abstract double getArea();

	public abstract double getPerrimeter();

	public abstract String toString();
}
