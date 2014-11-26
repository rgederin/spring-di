package v3.java.tightcoupling.factory;

/**
 * Now all logic of creating shapes encapsulates in Factry class
 * 
 * @author Ruslan
 *
 */
public class DrawApp {

	public void drawShape(int type) {
		Shape shape = ShapeFactory.createShape(type);
		if (shape != null)
			drawShape(shape);
	}

	private void drawShape(Shape shape) {
		shape.draw();
	}
}
