package v19.spring.di.annotations.autowired;

public class Circle implements Shape {
	private String message;

	/**
	 * Setter injection of the message
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void draw() {
		System.out.println(message);
	}
}
