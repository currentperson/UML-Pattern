package cn.edu.nankai.decoraterpattern.main;

public class HeaderDecoraterOne extends Decorater{

	public HeaderDecoraterOne(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Header One");
		super.print();
	}

}
