package v5.spring.di.xml.constructor;

public class DrawApp {
	private Shape shape;
	
	public DrawApp (Shape shape){
		this.shape = shape;
	}
	public void drawShape(){
		this.shape.draw();
	}
}
