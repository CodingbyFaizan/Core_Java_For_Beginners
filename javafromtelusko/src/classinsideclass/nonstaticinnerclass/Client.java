package classinsideclass.nonstaticinnerclass;

public class Client {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		Outer.Inner i = o.new Inner();
		System.out.println(o.inner);
		System.out.println(i.outer);
	}
}
