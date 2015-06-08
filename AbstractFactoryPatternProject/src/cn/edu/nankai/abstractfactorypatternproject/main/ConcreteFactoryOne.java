package cn.edu.nankai.abstractfactorypatternproject.main;

public class ConcreteFactoryOne extends AbstractFactory{

	@Override
	public ProductOne createProductOne() {
		// TODO Auto-generated method stub
		return new ConcreteProductOneF();
	}

	@Override
	public ProductTwo createProductTwo() {
		// TODO Auto-generated method stub
		return new ConcreteProductTwoF();
	}

}
