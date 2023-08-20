package inheritance.examples;


//Single inheritance 

class A{
	public void show1() {
		System.out.println("in A show()");
	}
}

class B extends A{
	public void show2() {
		System.out.println("in B show()");
	}
}




public class SingleLevelInheritance {
	public static void main(String args[]) {
		B obj1 = new B();
		obj1.show1();
		obj1.show2();
	}
}
