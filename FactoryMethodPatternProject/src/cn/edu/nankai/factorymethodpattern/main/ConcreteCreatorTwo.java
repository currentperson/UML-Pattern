package cn.edu.nankai.factorymethodpattern.main;

public class ConcreteCreatorTwo extends Creator{

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ConcreteProductTwo(5);
	}

}
