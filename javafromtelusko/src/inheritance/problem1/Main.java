package inheritance.problem1;

public class Main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		Circle c = new Circle(10);
		
		double rect = r.calculateArea();
		double circ = c.calculateArea();
		System.out.println(rect);
		System.out.println(circ);
	}
}
