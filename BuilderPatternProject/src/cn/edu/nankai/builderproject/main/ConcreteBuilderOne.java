package cn.edu.nankai.builderproject.main;

public class ConcreteBuilderOne extends Builder{

	private Product product;
	
	public ConcreteBuilderOne(Product product) {
		// TODO Auto-generated method stub
		this.product = product;
	}
	
	@Override
	public void buildPartOne() {
		// TODO Auto-generated method stub
		this.product.getContent().add(1);
	}

	@Override
	public void buildPartTwo() {
		// TODO Auto-generated method stub
		this.product.getContent().add(111);
	}

	public Product getProduct() {
		
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
