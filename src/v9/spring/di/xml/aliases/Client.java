package v9.spring.di.xml.aliases;

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
				"v9-spring-di-xml-aliases.xml");
		DrawApp app = context.getBean("draw-triangle-alias", DrawApp.class);
		app.drawShape();
		app = context.getBean("draw-circle-name", DrawApp.class);
		app.drawShape();
	}
}
