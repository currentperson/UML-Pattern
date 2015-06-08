package cn.edu.nankai.abstractfactorypatternproject.main;

public class Main {
	public static void main(String[] args) {
		new ConcreteFactoryOne().createProductOne().print();
		new ConcreteFactoryTwo().createProductTwo().showMessage();
	}
}
