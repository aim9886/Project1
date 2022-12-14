package Types;

interface Animal {
	public void noise();
}

class Cat implements Animal {
	public void noise()

	{
		System.out.println("Meow Meow noise...");
	}
}

class Dog implements Animal 
{
	public void noise()
	{
		System.out.println("Bow boww noise...");
	}
}

class Snake implements Animal {
	public void noise()

	{
		System.out.println("hiss buss tuss noise...");
	}
}

class Stimulator {
	static void ansim(Animal a1) {
		a1.noise();
	}
}

public class Mainclass2 {
	public static void main(String[] args)// Abstraction.
	{
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		Snake s1 = new Snake();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		Stimulator.ansim(s1);
	}
}