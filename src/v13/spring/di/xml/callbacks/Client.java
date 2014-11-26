package v13.spring.di.xml.callbacks;

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
				"v13-spring-di-xml-callbacks.xml");
		//for closing context
		context.registerShutdownHook();
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
		app = context.getBean("draw-circle", DrawApp.class);
		app.drawShape();
	}
}
