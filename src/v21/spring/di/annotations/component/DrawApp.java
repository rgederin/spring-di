package v21.spring.di.annotations.component;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component //@Service //@Repository //@Controller
public class DrawApp {

	private Shape shape;

	@Resource
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		this.shape.draw();
	}
}
