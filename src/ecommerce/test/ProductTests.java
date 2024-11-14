package ecommerce.test;

import java.util.ArrayList;
import java.util.List;

import ecommerce.model.Product;
import ecommerce.model.ProductSmartphone;

public class ProductTests {

	public static void test() {

		List<Product> smartphones = new ArrayList<Product>();

		smartphones.add(new ProductSmartphone("iPhone 13", 5000.00f, 10, "Smartphone de última geração da Apple",
				"Tecnologia", 5000.00f, "iOS", "Apple"));
		smartphones.add(new ProductSmartphone("Samsung Galaxy S21", 4500.00f, 8, "Smartphone topo de linha da Samsung",
				"Tecnologia", 4500.00f, "Android", "Samsung"));
		smartphones.add(new ProductSmartphone("Motorola Moto G60", 1500.00f, 15, "Smartphone intermediário da Motorola",
				"Tecnologia", 1500.00f, "Android", "Motorola"));
		smartphones.add(new ProductSmartphone("Xiaomi Mi 11", 3500.00f, 12, "Smartphone premium da Xiaomi",
				"Tecnologia", 3500.00f, "Android", "Xiaomi"));
		smartphones.add(new ProductSmartphone("OnePlus 9", 3800.00f, 5, "Smartphone de alta performance da OnePlus",
				"Tecnologia", 3800.00f, "Android", "OnePlus"));
		smartphones.add(new ProductSmartphone("Google Pixel 6", 4000.00f, 7,
				"Smartphone com Android puro e excelente câmera", "Tecnologia", 4000.00f, "Android", "Google"));
		smartphones.add(new ProductSmartphone("Sony Xperia 1 II", 6000.00f, 3,
				"Smartphone de alto desempenho para profissionais de vídeo e foto", "Tecnologia", 6000.00f, "Android",
				"Sony"));
		smartphones.add(new ProductSmartphone("Asus Zenfone 8", 3000.00f, 9, "Smartphone compacto e potente da Asus",
				"Tecnologia", 3000.00f, "Android", "Asus"));
		smartphones.add(new ProductSmartphone("Nokia 8.3", 2000.00f, 6, "Smartphone da Nokia com 5G e grande autonomia",
				"Tecnologia", 2000.00f, "Android", "Nokia"));
		smartphones.add(new ProductSmartphone("LG Velvet", 2200.00f, 4,
				"Smartphone com design único e boas especificações", "Tecnologia", 2200.00f, "Android", "LG"));

		System.out.println("\n--- Teste de Criação e Visualização dos 10 Smartphones ---");

		for (Product smartphone : smartphones) {
            smartphone.display();
        }
		
	}

}
