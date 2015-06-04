package cn.edu.nankai.strategypatternproject.main;

public class Context {

	private Strategy myStrategy;

	public Strategy getMyStrategy() {
		return myStrategy;
	}

	public void setMyStrategy(Strategy myStrategy) {
		this.myStrategy = myStrategy;
	}
	
	public Context(){
		this.myStrategy = new ConcreteStrategyOne();
	}
	
	public Context(Strategy myStrategy){
		this.myStrategy = myStrategy;
	}
	
	public void doStartegy(int parameter1, int parameter2){
		this.myStrategy.doSomething(parameter1,parameter2);
	}
}
