package v5.spring.di.xml.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Inject all dependencies via constructors from xml
 * @author Ruslan
 *
 */
public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"v5-spring-di-xml-constructor.xml");
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
		app = context.getBean("draw-circle", DrawApp.class);
		app.drawShape();
	}
}
