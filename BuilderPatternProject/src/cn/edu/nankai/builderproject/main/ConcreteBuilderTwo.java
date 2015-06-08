package cn.edu.nankai.builderproject.main;

public class ConcreteBuilderTwo extends Builder{

	private Product product;
	
	public ConcreteBuilderTwo(Product product) {
		// TODO Auto-generated constructor stub
		this.product = product;
	}
	
	@Override
	public void buildPartOne() {
		// TODO Auto-generated method stub
		this.product.getContent().add(2);
	}

	@Override
	public void buildPartTwo() {
		// TODO Auto-generated method stub
		this.product.getContent().add(222);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
