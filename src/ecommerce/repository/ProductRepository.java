package ecommerce.repository;

import ecommerce.model.Product;

public interface ProductRepository {
	
    // CRUD do product
    public void findByName(String name);

    public void listAll();
   
    public void listByCategory(String categoty);

    public void cadastrar(Product product);

    public void atualizar(Product product);

    public void deletar(Product product);

}
