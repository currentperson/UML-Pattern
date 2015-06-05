package cn.edu.nankai.objectpattern;

public class Client {
	
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
	    target.printMessage();
	    Target newtarget = new Adapter(new SubAdaptee());
	    newtarget.printMessage();
	}
}
