package cn.edu.nankai.classpattern;

public class Adapter extends Adaptee implements Target{

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		super.printMyself();
		System.out.println("This is adapter");
	}

}
