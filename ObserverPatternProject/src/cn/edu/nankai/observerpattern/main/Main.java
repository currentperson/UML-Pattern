package cn.edu.nankai.observerpattern.main;

public class Main {
	
	public static void main(String[] args) {
		Observer one = new ConcreteObserverOne();
		Observer two = new ConcreteObserverTwo();
		Observer three = new ConcreteObserverThree();
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.addObserver(one);
		concreteSubject.addObserver(two);
		concreteSubject.setState(5);
		concreteSubject.addObserver(three);
		concreteSubject.setState(30);
		concreteSubject.removeObserver(one);
		concreteSubject.setState(40);
	}
}
