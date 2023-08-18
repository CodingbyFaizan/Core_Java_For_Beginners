package inheritance.problem2;

public class Client {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();

		d.makeSound();
		c.makeSound();
	}
}