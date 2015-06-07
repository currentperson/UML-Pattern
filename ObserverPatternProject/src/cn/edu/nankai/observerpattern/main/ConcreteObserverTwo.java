package cn.edu.nankai.observerpattern.main;

public class ConcreteObserverTwo extends Observer{
	
	@Override
	public void update(int state) {
		// TODO Auto-generated method stub
		System.out.println("Two: " + state);
	}
}
