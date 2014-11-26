package v19.spring.di.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DrawApp {
	private Shape shape;
	
	@Autowired
	@Qualifier("circleQualifier")
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}
}
