package cn.edu.nankai.observerpattern.main;

import java.util.ArrayList;

public abstract class Subject {
	protected ArrayList<Observer> obervers = new  ArrayList<Observer>();
	public abstract void addObserver(Observer observer);
	public abstract void removeObserver(Observer observer);
	public abstract void notifyAllObserver();
}
