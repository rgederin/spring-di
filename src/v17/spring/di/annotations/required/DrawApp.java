package v17.spring.di.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class DrawApp {
	private Shape shape;
	
	@Required
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	
	public void drawShape(){
		this.shape.draw();
	}
}
