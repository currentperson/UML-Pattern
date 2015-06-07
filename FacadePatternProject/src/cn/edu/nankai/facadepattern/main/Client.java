package cn.edu.nankai.facadepattern.main;

public class Client {
	
	public static void main(String[] args) {
		SystemFacade facade = new SystemFacade();
		facade.operate();
	}
}
