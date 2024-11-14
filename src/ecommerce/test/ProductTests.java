package ecommerce.test;


import ecommerce.model.ProductSmartphone;
import ecommerce.controller.ProductController;

public class ProductTests {

    public static void test(ProductController productController) {
        
        productController.addProduct(new ProductSmartphone("iPhone 13", 5000.00f, 10, "Smartphone de última geração da Apple", "Tecnologia", 5000.00f, "iOS", "Apple"));
        productController.addProduct(new ProductSmartphone("Samsung Galaxy S21", 4500.00f, 8, "Smartphone topo de linha da Samsung", "Tecnologia", 4500.00f, "Android", "Samsung"));
        productController.addProduct(new ProductSmartphone("Motorola Moto G60", 1500.00f, 15, "Smartphone intermediário da Motorola", "Tecnologia", 1500.00f, "Android", "Motorola"));
        
        System.out.println("\n--- Teste de Criação e Visualização dos Smartphones ---");
        

        productController.listAll();
        
        System.out.println("\n--- Teste de Busca por Nome ---");
        

        productController.findByName("iPhone 13");
    }
}