package ecommerce.repository;

public interface ProductRepository {
	
    // CRUD do product
    public void findByName();

    public void listAll();
   
<<<<<<< Updated upstream
    public void listByCategory();

    public void cadastrar();

    public void atualizar();

    public void deletar();
=======
    public void listByCategory(String category);

    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(String name);
>>>>>>> Stashed changes

}
