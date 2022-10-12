package com.pooven.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pooven.product.dto.Product;

@Component
public class ProductConsumer {
	
	public void consumeProductApi() {
		
		RestTemplate temp =new RestTemplate();
		String endPoint = "http://localhost:8001/product";
		
		Product[] arr = temp.getForObject(endPoint, Product[].class);
		for(Product p : arr) {
			System.out.println(p.getProductId()+"--"+p.getProductName());
		}
		
	}

}
