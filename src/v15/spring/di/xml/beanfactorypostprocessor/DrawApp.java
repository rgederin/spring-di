package v15.spring.di.xml.beanfactorypostprocessor;

public class DrawApp {
	private Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
