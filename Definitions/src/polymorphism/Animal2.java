package polymorphism;

public class Animal2 {

	public int age;
	public void animalSound() {
		System.out.println("The animal makes sound");
	}
	public void animaAge() {
		System.out.println("Animals age ise " + age);
	}
	public void animaAge(int addAge) {
		System.out.println("Animals age ise " + (age+addAge));
	}	
	public void animaAge(double addAge) {
		System.out.println("Animals age ise " + (age+addAge));
	}
}
