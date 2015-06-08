package cn.edu.nankai.builderproject.main;

import java.util.ArrayList;

public class Product {

	private ArrayList<Integer> content;

	public Product(){
		content = new ArrayList<Integer>();
	}
	public ArrayList<Integer> getContent() {
		return content;
	}

	public void setContent(ArrayList<Integer> content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Product: " + content.get(0) + " : " + content.get(1);
		return str;
	}
}
