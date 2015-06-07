package cn.edu.nankai.observerpattern.main;

public class ConcreteObserverThree extends Observer{
	
	@Override
	public void update(int state) {
		// TODO Auto-generated method stub
		System.out.println("Three: " + state);
	}
}
