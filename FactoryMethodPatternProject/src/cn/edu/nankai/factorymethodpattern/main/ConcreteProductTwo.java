package cn.edu.nankai.factorymethodpattern.main;

public class ConcreteProductTwo extends Product{

	public ConcreteProductTwo(int state) {
		super(state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Two: " + state);
	}

}
