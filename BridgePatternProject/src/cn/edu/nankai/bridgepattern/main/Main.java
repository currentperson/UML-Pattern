package cn.edu.nankai.bridgepattern.main;

public class Main {
	
	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementOne());
		abstraction.operate();
	}
}
