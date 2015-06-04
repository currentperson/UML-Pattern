package cn.edu.nankai.singtonpatternproject.main;

public class Main implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SingtonClass: " + SingtonClass.getInstance());
		System.out.println("SingtonClass2: " + SingtonClass2.getInstance());
		System.out.println("SingtonClassMul: " + SingtonClassMul.getInstance());
		System.out.println("**************************************************");
	}

	
	public static void main(String[] args) {
		Thread[] creaters = new Thread[10];
		for(int i = 0;i < 10;i++){
			creaters[i] = new Thread(new Main());
		}
		for(int i = 0;i < 10;i++){
			creaters[i].start();
		}
	}
}
