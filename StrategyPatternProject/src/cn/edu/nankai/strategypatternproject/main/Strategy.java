package cn.edu.nankai.strategypatternproject.main;

public abstract class Strategy {

	protected int attribute;
	
	public void doSomething(int parameter1, int parameter2){
		System.out.println("Strategy: " + attribute);
	}
}
