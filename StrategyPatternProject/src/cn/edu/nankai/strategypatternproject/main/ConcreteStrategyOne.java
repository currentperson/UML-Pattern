package cn.edu.nankai.strategypatternproject.main;

public class ConcreteStrategyOne extends Strategy{

	public ConcreteStrategyOne() {
		// TODO Auto-generated constructor stub
		this.attribute = 1;
	}
	
	@Override
	public void doSomething(int parameter1,int parameter2) {
		// TODO Auto-generated method stub
		//super.doSomething();
		System.out.println("ContrateStrategyOne: " + attribute + ".Parameter1: " + parameter1);
	}
	
}
