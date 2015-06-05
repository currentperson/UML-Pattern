package cn.edu.nankai.objectpattern;

public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter() {
		// TODO Auto-generated constructor stub
	}
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		this.adaptee.printMyself();
	}

}
