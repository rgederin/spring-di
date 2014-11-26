package v11.spring.di.xml.beanscopes;

public class Circle implements Shape {
	private String message;

	/**
	 * Setter injection of the message
	 * @param message
	 */
	public void setMessage(String message) {
		System.out.println(Circle.class + ".setMessage()");
		this.message = message;
	}

	public void draw() {
		System.out.println(message);
	}
}
