package intheritancePoint;

import intheritanceAnimal.Animal;

public class Dog extends Animal{
	
public static void main(String[] args) {
	
	Dog dog=new Dog();
	
	Animal animal=new Animal();
//	animal.name="UNKNOWN";
//	
//	System.out.println(animal.name);
	System.out.println(dog.name);
	
	dog.move();
	dog.dogSound();
	color="blue";
	color="brown";
	System.out.println(color);
	System.out.println(color);
}
	public void move()
	{
		System.out.println("Dog is walking");
	}
	public void dogSound() {
		System.out.println("Dog is barking");
	}
}
