package v1.java.tightcoupling;

public class Client {
	public static void main (String [] args){
		DrawApp app = new DrawApp();
		app.drawTriangle();
		app.drawCircle();
	}
}
