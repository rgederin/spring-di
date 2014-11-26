package v23.spring.di.eventhandling;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Circle implements Shape, ApplicationEventPublisherAware {
	private String message;
	private ApplicationEventPublisher publisher;
	
	/**
	 * Setter injection of the message
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void draw() {
		publisher.publishEvent(new DrawEvent(this));
		System.out.println(message);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
