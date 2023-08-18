package inheritance.problem1;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(int w,int h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
}
