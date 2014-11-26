package v8.spring.di.xml.collections;

import java.util.List;

public class DrawApp {
	private List<Shape> shapes;

	public void setShapes(List<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public void drawShapes (){
		for (Shape shape : shapes){
			shape.draw();
		}
	}
}
