package cn.edu.nankai.decoraterpattern.main;

public class FooterDecoraterOne extends Decorater{

	public FooterDecoraterOne(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Footer One");
	}

}
