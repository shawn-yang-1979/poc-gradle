package poc.gradle.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import poc.gradle.domain.Product;

@RestController
@RequestMapping("products")
public class GreetingController {

	@GetMapping
	public Product getProductByName(@RequestParam String name) {
		Product product = new Product();
		product.setName(name);
		return product;
	}

}