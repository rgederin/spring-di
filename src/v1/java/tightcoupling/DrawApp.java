package v1.java.tightcoupling;

/**
 * Tight coupling with Triangle and Circle objects
 * 
 * @author Ruslan
 *
 */
public class DrawApp {
	private Triangle triangle;
	private Circle circle;

	public DrawApp() {
		// direct call new
		this.triangle = new Triangle();
		this.circle = new Circle();
	}

	public void drawTriangle() {
		this.triangle.draw();
	}

	public void drawCircle() {
		this.circle.draw();
	}
}
