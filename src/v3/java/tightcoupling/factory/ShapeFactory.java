package v3.java.tightcoupling.factory;

/**
 * Shape factory responsible for shape objects creation
 * All logic with "new" now encapsulate in this class
 * @author Ruslan
 *
 */
public class ShapeFactory {
	public static Shape createShape (int type){
		Shape instance = null;
		switch (type) {
		case 0:
			instance = new Triangle();
			break;
		case 1:
			instance = new Circle();
		default:
			break;
		}
		return instance;
	}
}
