package ecommerce.test;

import ecommerce.model.Product;
import ecommerce.model.ProductSmartphone;

public class ProductTests {

	public static void test() {
		
		Product smartphone1 = new ProductSmartphone("iPhone 13", 5000.00f, 10, "Smartphone de última geração da Apple",
				"Tecnologia", 5000.00f, "iOS", "Apple");
		Product smartphone2 = new ProductSmartphone("Samsung Galaxy S21", 4500.00f, 8,
				"Smartphone topo de linha da Samsung", "Tecnologia", 4500.00f, "Android", "Samsung");
		Product smartphone3 = new ProductSmartphone("Motorola Moto G60", 1500.00f, 15,
				"Smartphone intermediário da Motorola", "Tecnologia", 1500.00f, "Android", "Motorola");
		Product smartphone4 = new ProductSmartphone("Xiaomi Mi 11", 3500.00f, 12, "Smartphone premium da Xiaomi",
				"Tecnologia", 3500.00f, "Android", "Xiaomi");
		Product smartphone5 = new ProductSmartphone("OnePlus 9", 3800.00f, 5,
				"Smartphone de alta performance da OnePlus", "Tecnologia", 3800.00f, "Android", "OnePlus");
		Product smartphone6 = new ProductSmartphone("Google Pixel 6", 4000.00f, 7,
				"Smartphone com Android puro e excelente câmera", "Tecnologia", 4000.00f, "Android", "Google");
		Product smartphone7 = new ProductSmartphone("Sony Xperia 1 II", 6000.00f, 3,
				"Smartphone de alto desempenho para profissionais de vídeo e foto", "Tecnologia", 6000.00f, "Android",
				"Sony");
		Product smartphone8 = new ProductSmartphone("Asus Zenfone 8", 3000.00f, 9,
				"Smartphone compacto e potente da Asus", "Tecnologia", 3000.00f, "Android", "Asus");
		Product smartphone9 = new ProductSmartphone("Nokia 8.3", 2000.00f, 6,
				"Smartphone da Nokia com 5G e grande autonomia", "Tecnologia", 2000.00f, "Android", "Nokia");
		Product smartphone10 = new ProductSmartphone("LG Velvet", 2200.00f, 4,
				"Smartphone com design único e boas especificações", "Tecnologia", 2200.00f, "Android", "LG");


		System.out.println("\n--- Teste de Criação e Visualização dos 10 Smartphones ---");

		smartphone1.display();
		smartphone2.display();
		smartphone3.display();
		smartphone4.display();
		smartphone5.display();
		smartphone6.display();
		smartphone7.display();
		smartphone8.display();
		smartphone9.display();
		smartphone10.display();
	}

}
