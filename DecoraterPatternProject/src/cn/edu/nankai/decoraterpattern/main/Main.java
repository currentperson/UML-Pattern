package cn.edu.nankai.decoraterpattern.main;

public class Main {

	public static void main(String[] args) {
		
		 Component component = new HeaderDecoraterOne(
				                     new HeaderDecoraterTwo(
				                    		 new FooterDecoraterOne(
				                    				 new FooterDecoraterTwo(
				                    					new ConcreteComponent()
				                    					)
				                    				 )
				                    		 )
				                     );
		 component.print();
	}
}
