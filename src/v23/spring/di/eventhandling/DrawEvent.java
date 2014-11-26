package v23.spring.di.eventhandling;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
	}
	
	@Override
	public String toString(){
		return "Draw event occured";
	}
}
