package cn.edu.nankai.facadepattern.main;

public class SystemFacade {
	
	SubsystemOne one = new SubsystemOne();
	SubsystemTwo two = new SubsystemTwo();
	SubsystemThree three = new SubsystemThree();
	
	public void operateOneAndTwo(){
		one.operateOne();
		two.operateOTwo();
	}
	
	public void operateOneAndThree(){
		one.operateOne();
		three.operateThree();
	}
	
	public void operate(){
		one.operateOne();
		two.operateOTwo();
		three.operateThree();
	}
}
