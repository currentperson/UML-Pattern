package cn.edu.nankai.abstractfactorypatternproject.main;

public class ConcreteFactoryTwo extends AbstractFactory{

	@Override
	public ProductOne createProductOne() {
		// TODO Auto-generated method stub
		return new ConcreteProductOneS();
	}

	@Override
	public ProductTwo createProductTwo() {
		// TODO Auto-generated method stub
		return new ConcreteProductTwoS();
	}

}
