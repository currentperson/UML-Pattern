package cn.edu.nankai.singtonpatternproject.main;

public class SingtonClassMul {

	private static SingtonClassMul singtonClassMul;
	
	private SingtonClassMul(){
		
	}
	
	public static synchronized  SingtonClassMul getInstance(){
		if(singtonClassMul == null)
			singtonClassMul = new SingtonClassMul(); 
		return singtonClassMul;
	}
}
