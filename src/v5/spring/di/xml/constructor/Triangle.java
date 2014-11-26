package v5.spring.di.xml.constructor;

public class Triangle implements Shape{
	private String message;
	
	/**
	 * Constructor injection
	 * @param message
	 */
	public Triangle (String message){
		this.message = message;
	}
	public void draw(){
		System.out.println(message);
	}
}
