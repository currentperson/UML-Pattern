package cn.edu.nankai.decoraterpattern.main;

public class FooterDecoraterTwo extends Decorater{

	public FooterDecoraterTwo(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Footer Two");
	}

}
