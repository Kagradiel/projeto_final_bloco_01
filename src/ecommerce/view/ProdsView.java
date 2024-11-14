package ecommerce.view;

import java.util.Scanner;

import ecommerce.controller.ProductController;
import ecommerce.model.Product;
import ecommerce.model.ProductSmartphone;

public class ProdsView {
	
	public static void listAll(ProductController productController) {
        System.out.println("\n--- Listando todos os produtos ---");
        productController.listAll();
    }
	
	public static void create(Scanner read, ProductController productController) {
        System.out.println("\nDigite o nome do produto:");
        String name = read.nextLine();
        
        System.out.println("Digite o preço do produto:");
        float price = read.nextFloat();
        
        System.out.println("Digite a quantidade em estoque:");
        int stock = read.nextInt();
        read.nextLine();  // 
        
        System.out.println("Digite a descrição do produto:");
        String description = read.nextLine();
        
        System.out.println("Digite o sistema operacional:");
        String os = read.nextLine();
        
        System.out.println("Digite a marca:");
        String brand = read.nextLine();
        
        
        Product product = new ProductSmartphone(name, price, stock, description, "Smartphone", price, os, brand);
        productController.addProduct(product);
        
        System.out.println("Produto " + name + " cadastrado com sucesso!");
        
    }
	
	public static void update(Scanner read, ProductController productController) {
        System.out.println("\nDigite o nome do produto para atualizar:");
        String name = read.nextLine();
        
        Product existingProduct = productController.findProductInArray(name);
        
        if (existingProduct != null) {
            System.out.println("Digite o novo preço do produto:");
            float price = read.nextFloat();
            
            System.out.println("Digite a nova quantidade em estoque:");
            int stock = read.nextInt();
            read.nextLine();
            
            System.out.println("Digite a nova descrição do produto:");
            String description = read.nextLine();
            
            existingProduct.setPrice(price);
            existingProduct.setStock(stock);
            existingProduct.setDescription(description);
            
            productController.updateProduct(existingProduct);
        } else {
            System.out.println("Produto não encontrado para atualização.");
            
        }
    }

    public static void delete(Scanner read, ProductController productController) {
        System.out.println("\nDigite o nome do produto para excluir:");
        String name = read.nextLine();
        
        productController.deleteProduct(name);
        
    }

    public static void search(Scanner read, ProductController productController) {
        System.out.println("\nDigite o nome do produto para buscar:");
        String name = read.nextLine();
        
        productController.findByName(name);
        
    }
    
    public static void listByCategory(Scanner read, ProductController productController) {
    	System.out.println("\nDigite a categoria dos produtos que deseja listar:");
        String category = read.nextLine().trim();

        if (category.isEmpty()) {
            System.out.println("A categoria não pode ser vazia. Tente novamente.");
            return;  
        }

       
        productController.listByCategory(category);
    }

}
