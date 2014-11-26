package v14.spring.di.xml.postbeanprocessor;

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
				"v14-spring-di-xml-postbeanprocessor.xml");
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
		app = context.getBean("draw-circle", DrawApp.class);
		app.drawShape();
	}
}
