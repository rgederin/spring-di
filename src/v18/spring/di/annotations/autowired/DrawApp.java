package v18.spring.di.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class DrawApp {
	private Shape shape;
	
	@Autowired
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
