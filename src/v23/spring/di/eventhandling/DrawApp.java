package v23.spring.di.eventhandling;

public class DrawApp {
	private Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
