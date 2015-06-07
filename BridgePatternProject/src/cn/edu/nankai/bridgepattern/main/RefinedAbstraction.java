package cn.edu.nankai.bridgepattern.main;

public class RefinedAbstraction extends Abstraction{
	
	public RefinedAbstraction() {
		// TODO Auto-generated constructor stub
	}
	
	public RefinedAbstraction(Implement implement){
		this.implement = implement;
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("Refined Abstraction");
		implement.operateImpl();
	}
}
