package v20.spring.di.annotations.jsr250;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Inject all dependencies via setters from xml
 * @author Ruslan
 *
 */
public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"v20-spring-di-annotations-jsr250.xml");
		context.registerShutdownHook();
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
	}
}
