package cn.edu.nankai.factorymethodpattern.main;

public class Main {
	
	public static void main(String[] args) {
		new ConcreteCreatorOne().createProduct().print();
		new ConcreteCreatorTwo().createProduct().print();
	}
}
