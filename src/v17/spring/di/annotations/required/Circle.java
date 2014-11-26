package v17.spring.di.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	private String message;

	/**
	 * Setter injection of the message
	 * @param message
	 */
	@Required
	public void setMessage(String message) {
		this.message = message;
	}

	
	public void draw() {
		System.out.println(message);
	}
}
