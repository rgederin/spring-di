package v11.spring.di.xml.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean scopes:
 * Singleton: only once per Spring container - default
 * Prototype: new bean created with every request or reference
 * Request: new bean per servlet request
 * Session: new bean per session
 * Global Session: new bean per global HTTP session (portlet context)
 * @author Ruslan
 *
 */
public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"v11-spring-di-xml-beanscopes.xml");
		DrawApp drawShape = context.getBean("draw-triangle", DrawApp.class);
		DrawApp drawShape1 = context.getBean("draw-triangle", DrawApp.class);
		
		//true since we used Singleton scope for "draw-triangle"
		System.out.println("Comparison of two beans which are using Singleton scope: " + (drawShape==drawShape1));
		
		System.out.println();
		
		drawShape=context.getBean("draw-circle", DrawApp.class);
		drawShape1=context.getBean("draw-circle", DrawApp.class);

		//false since we used Singleton scope for "draw-triangle"
		System.out.println("Comparison of two beans which are using Singleton scope: " + (drawShape==drawShape1));

	}
}
