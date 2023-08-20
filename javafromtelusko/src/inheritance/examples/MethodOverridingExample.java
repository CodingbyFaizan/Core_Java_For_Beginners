package inheritance.examples;

//Method Overriding 

class Calc{
	public int add(int n1,int n2) {
		return n1+n2;
	}
}

class AdvCalc extends Calc{
	
//	overrided methhod
	public int add(int n1,int n2) {
		return n1+n2+2;
	}
}
public class MethodOverridingExample {
	public static void main(String[] args) {
		AdvCalc obj = new AdvCalc();
		
		System.out.println(obj.add(3,4));
		
	}
}
