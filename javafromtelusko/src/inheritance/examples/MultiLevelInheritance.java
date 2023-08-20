package inheritance.examples;

//MultiLevelInheritance
//by default every class in extends Object class so here class A extends Object class implicitly..

//multiple inheritance is not supported directly in java ....

class A {
	public void method1() {
		System.out.println("in a method");
	}
}

class B extends A{
	public void method2() {
		System.out.println("in b method");
	}
}

class C extends B{
	public void method3() {
		System.out.println("in c method");
	}
}


public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		C obj1 = new C();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		
	}
}
