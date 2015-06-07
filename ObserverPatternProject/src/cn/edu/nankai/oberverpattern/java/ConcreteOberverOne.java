package cn.edu.nankai.oberverpattern.java;

import java.util.Observable;
import java.util.Observer;

public class ConcreteOberverOne implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("One: " + arg);
	}

}
