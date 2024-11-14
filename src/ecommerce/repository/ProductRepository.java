package ecommerce.repository;

public interface ProductRepository {
	
    // CRUD do product
    public void findByName();

    public void listAll();
   
    public void listByCategory();

    public void cadastrar();

    public void atualizar();

    public void deletar();

}
