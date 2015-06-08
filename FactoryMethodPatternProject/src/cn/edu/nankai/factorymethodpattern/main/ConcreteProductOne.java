package cn.edu.nankai.factorymethodpattern.main;

public class ConcreteProductOne extends Product{

	public ConcreteProductOne(int state) {
		super(state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("One: " + state);
	}

}
