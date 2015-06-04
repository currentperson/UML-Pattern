package cn.edu.nankai.singtonpatternproject.main;

public class SingtonClass2 {

	private static SingtonClass2 uniqueClass2;
	
	private SingtonClass2(){
		
	}
	
	public static SingtonClass2 getInstance(){
		if(uniqueClass2 == null)
			uniqueClass2 = new SingtonClass2(); 
		return uniqueClass2;
	}
}
