package cn.edu.nankai.observerpattern.main;

public class ConcreteSubject extends Subject{

	private int state;
	
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.obervers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.obervers.remove(observer);
	}

	@Override
	public void notifyAllObserver() {
		// TODO Auto-generated method stub
		for(Observer oberver : this.obervers){
			oberver.update(this.getState());
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAllObserver();
	}

}
