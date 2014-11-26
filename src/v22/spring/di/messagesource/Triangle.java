package v22.spring.di.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Triangle implements Shape {
	private String message;
	
	@Autowired
	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * Setter injection of the message
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("greeting", null, "Default greeting message", null));
		System.out.println(this.messageSource.getMessage("draw.shape.message", new Object[] {this.message}, "Default triangle message", null));
	}
}
