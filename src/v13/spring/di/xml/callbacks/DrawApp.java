package v13.spring.di.xml.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DrawApp implements InitializingBean, DisposableBean{
	private Shape shape;
	
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}

	/**
	 * Call in initialization process 
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization of DrawApp bean");		
	}

	/**
	 * Call in destroy bean process
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying DrawApp bean");
		
	}
}
