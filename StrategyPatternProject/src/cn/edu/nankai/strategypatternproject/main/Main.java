package cn.edu.nankai.strategypatternproject.main;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.doStartegy(1,2);
		
		Context content2 = new Context(new ConcreteStrategyTwo());
		content2.doStartegy(1,2);
	}
}
