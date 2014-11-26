package v3.java.tightcoupling.factory;

public class Client {
	public static void main (String [] args){
		DrawApp app = new DrawApp();
		app.drawShape(0);
		app.drawShape(1);;
	}
}
