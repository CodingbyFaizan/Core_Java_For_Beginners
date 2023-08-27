package wrapperclass;

public class Demo {
	public static void main(String[] args) {
		
		int num1 = 8;
		
		Integer num2 = new Integer(num1); // boxing 
//		converting primitive value to an object type : boxing 
		
		Integer num3 = num1;  //auto-boxing
//		converting primitive value to an object type automatically: auto-boxing
		
		
		int num4 = num3.intValue(); //unboxing
		
		int num5 = num3; // auto - unboxing
		System.out.println(num5);
	}
}
