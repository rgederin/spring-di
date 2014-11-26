package v8.spring.di.xml.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example of di for collections
 * @author Ruslan
 *
 */
public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"v8-spring-di-xml-collections.xml");
		DrawApp app = context.getBean("draw-shapes", DrawApp.class);
		app.drawShapes();
	}
}
