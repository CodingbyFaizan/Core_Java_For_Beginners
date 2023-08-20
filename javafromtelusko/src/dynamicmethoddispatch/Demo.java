package dynamicmethoddispatch;

// dynamic method dispatch

class A{
	public void show() {
		System.out.println("in A show method");
	}
}

class B extends A{
	public void show() {
		System.out.println("in B show method");
	}
}

//class C{
//	
//}

public class Demo {
	public static void main(String[] args) {
		A obj = new A();
		
		obj.show();
		
		obj = new B();
		
		obj.show();
	}
}
