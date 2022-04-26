package oops;

class Animal
{
	public void displayInfo()
	{
		System.out.println("This Block is Animal");
		System.out.println("This block is inside of the class");
	}
}
class Dog extends Animal
{
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("This Block is Dog");
	}
}

public class MethodeOverriding {
	public static void main(String[] args)
	{
		Dog d1 =new Dog();
		d1.displayInfo();
		//Animal a1 =new Animal();
		//a1.displayInfo();
	}
}

