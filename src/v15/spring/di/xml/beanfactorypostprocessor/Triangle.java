package v15.spring.di.xml.beanfactorypostprocessor;

public class Triangle implements Shape{
	private String message;
	
	/**
	 * Setter injection of the message
	 * @param message
	 */
	public void setMessage(String message){
		this.message = message;
	}
	public void draw(){
		System.out.println(message);
	}
}
