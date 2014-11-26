package v21.spring.di.annotations.component;


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
				"v21-spring-di-annotations-component.xml");
		context.registerShutdownHook();
		DrawApp app = context.getBean("drawApp", DrawApp.class);
		app.drawShape();
	}
}
