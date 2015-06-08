package cn.edu.nankai.factorymethodpattern.main;

public  abstract class Product {
	
	protected int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Product(int state) {
		super();
		this.state = state;
	}
	
	public abstract void print();
}
