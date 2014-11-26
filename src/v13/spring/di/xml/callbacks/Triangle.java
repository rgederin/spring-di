package v13.spring.di.xml.callbacks;

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
	
	public void init(){
		System.out.println("Initialization of Triangle bean");
	}
	
	public void destroy(){
		System.out.println("Destroying Triangle bean");
	}
}
