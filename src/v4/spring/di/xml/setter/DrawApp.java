package v4.spring.di.xml.setter;

public class DrawApp {
	private Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
