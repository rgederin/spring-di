package v2.java.tightcoupling.interfaces;

/**
 * Tight coupling with Triangle and Circle objects even with interfaces - again
 * direct new call
 * 
 * @author Ruslan
 *
 */
public class DrawApp {

	public void drawTriangle() {
		Shape shape = new Triangle();
		this.drawShape(shape);
	}

	public void drawCircle() {
		Shape shape = new Circle();
		this.drawShape(shape);
	}

	private void drawShape(Shape shape) {
		shape.draw();
	}
}
