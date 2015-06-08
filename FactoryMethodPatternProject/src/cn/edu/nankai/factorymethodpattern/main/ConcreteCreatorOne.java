/**
 * 
 */
package cn.edu.nankai.factorymethodpattern.main;

/**
 * @author wangwenhan
 *
 */
public class ConcreteCreatorOne extends Creator{

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ConcreteProductOne(4);
	}

}
