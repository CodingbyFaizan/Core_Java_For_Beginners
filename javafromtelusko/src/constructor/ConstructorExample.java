package constructor;

class A{
	
	{
		System.out.println("A instance block");
	}
	
	static {
		System.out.println("A static block");
	}

	public A() {
		System.out.println("A default constructor ");
	}
	public A(int n) {
		System.out.println("A parameterized constructor");
	}
}

class B extends A{
	
	
	{
		System.out.println("B instance block");
	}
	
	static {
		System.out.println("B static block");
	}
	
	
	
	public B() {
		
		System.out.println("B default constructor ");
	}
	public B(int n) {
//		this();
		System.out.println("B parameterized constructor");
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		B obj = new B();
		
	}
}
