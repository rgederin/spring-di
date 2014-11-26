package v11.spring.di.xml.beanscopes;

public class Triangle implements Shape{
	private String message;
	
	/**
	 * Setter injection of the message
	 * @param message
	 */
	public void setMessage(String message){
		System.out.println(Triangle.class + ".setMessage()");
		this.message = message;
	}
	public void draw(){
		System.out.println(message);
	}
}
