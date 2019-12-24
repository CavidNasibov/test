package polymorphism;

public class Lion extends Animal2 {

	public static void main(String[] args) {
		Animal2 lion1=new Lion();
		lion1.animalSound();
		lion1.age=5;
		lion1.animaAge();
		lion1.animaAge(6);//Java looking for close one.exam question
		lion1.animaAge(6.0);
		lion1.animaAge(new Integer(9));
	}
	
	public void animalSound() {
		System.out.println("Lion Roars...");
	}
}
