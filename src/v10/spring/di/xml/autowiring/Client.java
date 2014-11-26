package v10.spring.di.xml.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Inject all dependencies via setters from xml
 * @author Ruslan
 *
 */
public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"v10-spring-di-xml-autowiring.xml");
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
	}
}
