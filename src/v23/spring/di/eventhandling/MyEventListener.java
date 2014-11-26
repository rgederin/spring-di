package v23.spring.di.eventhandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		System.out.println("Creation (publishing) of event:" + applicationEvent);
	}
}
