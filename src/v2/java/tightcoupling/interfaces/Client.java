package v2.java.tightcoupling.interfaces;

public class Client {
	public static void main (String [] args){
		DrawApp app = new DrawApp();
		app.drawTriangle();
		app.drawCircle();
	}
}
