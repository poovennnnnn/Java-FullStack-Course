package com.pooven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pooven.dto.Product;

@RestController
public class DemoController {
	@Autowired
	RestTemplate temp;
	
	@GetMapping("/demo")
	public Product getProduct() {
		

		Product res = temp.getForObject("http://PRODUCT-SERVICE2/product/112", Product.class);
		return res;
	}

}
