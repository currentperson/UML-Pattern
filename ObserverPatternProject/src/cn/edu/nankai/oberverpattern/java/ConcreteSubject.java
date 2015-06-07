package cn.edu.nankai.oberverpattern.java;

import java.util.Observable;

public class ConcreteSubject extends Observable{

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//System.out.println("state: " + state);
		this.setChanged();
		this.notifyObservers(state);
	}
	
	public ConcreteSubject() {
		// TODO Auto-generated constructor stub
		this.state = 0;
	}
	
}
