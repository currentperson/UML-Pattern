package cn.edu.nankai.observerpattern.main;

public class ConcreteObserverOne extends Observer{

	@Override
	public void update(int state) {
		// TODO Auto-generated method stub
		System.out.println("One: " + state);
	}
}
