package v6.spring.di.xml.constructor;

public class Circle implements Shape {
	private String message;
	
	/**
	 * Constructor injection
	 * @param message
	 */
	public Circle (String message){
		this.message = message;
	}
	
	public void draw() {
		System.out.println(message);
	}
}
