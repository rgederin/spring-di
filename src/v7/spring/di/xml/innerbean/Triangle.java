package v7.spring.di.xml.innerbean;

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
