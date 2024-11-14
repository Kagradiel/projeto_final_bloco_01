package ecommerce.repository;

import ecommerce.model.Product;

public interface ProductRepository {
	
    // CRUD do product
    public void findByName(String name);

    public void listAll();
   
    public void listByCategory(String category);

    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(String name);


}
