package cn.edu.nankai.singtonpatternproject.main;

public class SingtonClass {

	private static SingtonClass uniqueSingtonClass = new SingtonClass();
	
	private SingtonClass(){
		
	}
	
	public static SingtonClass getInstance(){
		return uniqueSingtonClass;
	}
}
