package cn.edu.nankai.objectpattern;

public class SubAdaptee extends Adaptee{
	
	@Override
	public void printMyself() {
		// TODO Auto-generated method stub
		super.printMyself();
		System.out.println("This is my son");
	}
}
