package com.training;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProdId() - o2.getProdId();
	}

}
