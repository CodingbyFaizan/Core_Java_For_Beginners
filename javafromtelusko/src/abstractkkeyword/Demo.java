package abstractkkeyword;

//Abstract keyword 

//if you have abstract method in the class you need 
//to make a class as a abstract class 
//
//an abstract class does not need to have a abstract method they
//can have the concrete method
//
//if you make method abstract you need to implement it in the subclass
//
//it is also called as partial abstraction
//
//you cannot make a object of the abstract class

abstract class Car{
	public abstract void drive();
	
	public void show1() {
		System.out.println("Car A Show");
	}
}

class BMW extends Car{
	public void drive() {
		System.out.println("driving ");
	}
	public void show2() {
		System.out.println("Car B Show");
	}
}

public class Demo {
	public static void main(String[] args) {
		Car obj = new BMW();
		obj.drive();
		obj.show1();
		
		BMW obj2 = (BMW) obj;
		obj2.show2();
	}
}
