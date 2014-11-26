package v20.spring.di.annotations.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class DrawApp {
	private Shape shape;

	@Resource(name = "triangle-id")
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		this.shape.draw();
	}
	
	@PostConstruct
	public void init (){
		System.out.println("Init with @PostConstruct");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Destroy with @PreDestroy");
	}
}
