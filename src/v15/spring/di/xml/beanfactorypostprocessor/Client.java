package v15.spring.di.xml.beanfactorypostprocessor;

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
				"v15-spring-di-xml-beanfactorypostprocessor.xml");
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
		app = context.getBean("draw-circle", DrawApp.class);
		app.drawShape();
	}
}
