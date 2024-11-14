package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Product;
import ecommerce.repository.ProductRepository;

public class ProductController implements ProductRepository {
	
	private ArrayList<Product> products = new ArrayList<Product>();

	@Override
	public void findByName(String name) {
		
		for (var product : products) {
			if(product.getName().equals(name))
				product.display();
		}
	}

	@Override
	public void listAll() {
		
		for (var product : products) {
			product.display();
		}
	}

	@Override
	public void listByCategory(String category) {
		
		for (var product : products) {
			if(product.getCategory().equals(category))
				product.display();
		}
		
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void updateProduct(Product product) {
		var foundProduct = findProductInArray(product.getName());
		
		if(foundProduct != null) {
			products.set(products.indexOf(foundProduct), product);
			System.out.println("\nProduto " + product.getName() + " foi atualizado");
		}else {
			System.out.println("\nProduto " + product.getName() + " não foi encontrado");
		}
		
	}

	@Override
	public void deleteProduct(String name) {
		var product = findProductInArray(name);
		
		if(product != null) {
			if (products.remove(product))
			System.out.println("\nProduto " + name + " foi removido");
		}else {
			System.out.println("\nProduto " + name + " não foi encontrado");
		}
		
	}
	
	public Product findProductInArray(String name) {
		for (var product : products) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}

	
}
