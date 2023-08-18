package inheritance.problem3;

public class Client {
	public static void main(String[] args) {
		ShapeDrawer shape = new ShapeDrawer();
		
		Circle[] c = new Circle[1];
		c[0] = new Circle();
		Rectangle[] r = new Rectangle[1];
		r[0] = new Rectangle();
		Triangle[] t = new Triangle[1];
		t[0] = new Triangle();
		
		shape.drawShapes(c);
		shape.drawShapes(r);
		shape.drawShapes(t);
		
		
	}
}
