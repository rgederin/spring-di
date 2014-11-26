package v22.spring.di.messagesource;

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
				"v22-spring-di-messagesource.xml");
		DrawApp app = context.getBean("draw-triangle", DrawApp.class);
		app.drawShape();
		app = context.getBean("draw-circle", DrawApp.class);
		app.drawShape();
		
		//String message = context.getMessage("greeting", null, "Default message", null);
		//System.out.println(message);
	}
}
