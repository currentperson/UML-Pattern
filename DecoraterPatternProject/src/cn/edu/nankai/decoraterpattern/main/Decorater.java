package cn.edu.nankai.decoraterpattern.main;

public abstract class Decorater extends Component{
	private Component component;
	
	public Decorater(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		this.component.print();
	}
}
