package inheritance.problem3;

public class ShapeDrawer {
	public void drawShapes(Drawable[] shapes){
		for(Drawable x: shapes) {
			x.draw();
		}
	}
}
