package upcastinganddowncasting;

class A{
	
	
	public void show1() {
		System.out.println("in a show ");
	}
}

class B extends A{
	public void show2() {
		System.out.println("in b show ");
	}
}

public class Demo {
	public static void main(String[] args) {
		A obj1 = new B();
		obj1.show1();
//		obj1.show2();
		
		B obj2 = (B) obj1;
		obj2.show1();
		obj2.show2();
	}
}
