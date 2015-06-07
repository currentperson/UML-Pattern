package cn.edu.nankai.oberverpattern.java;

import java.util.Observer;

public class Main {
	
	public static void main(String[] args) {
		Observer one = new ConcreteOberverOne();
		Observer two = new ConcreteOberverTwo();
		Observer three = new ConcreteOberverThree();
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.addObserver(one);
		concreteSubject.addObserver(two);
		concreteSubject.setState(40);
		concreteSubject.addObserver(three);
		concreteSubject.setState(30);
		concreteSubject.deleteObserver(one);
		concreteSubject.setState(50);
	}
}
