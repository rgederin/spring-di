package v12.spring.di.xml.beaninheritance;

public class DrawApp {
	private Shape shape;
	private String message;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	public void drawShape(){
		System.out.println(this.message);
		this.shape.draw();
	}
}
