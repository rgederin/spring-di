package v11.spring.di.xml.beanscopes;

public class DrawApp {
	private Shape shape;
	
	public void setShape(Shape shape){
		System.out.println(DrawApp.class + ".setShape()");
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
