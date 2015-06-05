package cn.edu.nankai.decoraterpattern.main;

public class HeaderDecoraterTwo extends Decorater{

	public HeaderDecoraterTwo(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Header Two");
		super.print();
	}

}
