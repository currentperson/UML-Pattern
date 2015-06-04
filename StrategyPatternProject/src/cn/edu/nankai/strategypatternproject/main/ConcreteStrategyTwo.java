package cn.edu.nankai.strategypatternproject.main;

public class ConcreteStrategyTwo extends Strategy {
	
	public ConcreteStrategyTwo() {
		// TODO Auto-generated constructor stub
		this.attribute = 2;
	}
	
	@Override
	public void doSomething(int parameter1, int parameter2) {
		// TODO Auto-generated method stub
		//super.doSomething();
		System.out.println("ContrateStrategyTwo: " + attribute + ".parameter: " + parameter2);
	}
	
}
