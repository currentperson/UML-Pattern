package cn.edu.nankai.builderproject.main;

public class Directer {
	
	static Builder builder;
	public static Product buildTogether(){
		ConcreteBuilderOne concreteBuilderOne = new ConcreteBuilderOne(new Product());
		builder = (concreteBuilderOne);
		builder.buildPartOne();
		builder.buildPartTwo();
		return concreteBuilderOne.getProduct();
	}
	
	public static void main(String[] args) {
		System.out.println(buildTogether());
	}
}
