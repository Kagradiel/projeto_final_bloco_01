package ecommerce.model;

public class Product {

	private String name;
	private float price;
	private int stock;
	private String description;
	private String category;

	public Product(String name, int stock, String description, String category, float price) {
		this.category = category;
		this.description = description;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public int getStock() {
		return stock;
	}




	public void setStock(int stock) {
		this.stock = stock;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getCategory() {
		return category;
	}



	
	public void display() {
		
		System.out.println("**********************************************************************");
		System.out.println("          " + this.name + "                                           ");
		System.out.println("**********************************************************************");
		System.out.println("Preço: "+ this.price +"                                               ");
		System.out.println("Estoque: "+ this.stock +"                                             ");
		System.out.println("Categoria: " + this.category + "                                      ");
		System.out.println("Descrição:                                                            ");
		System.out.println(this.description                                                        );
		
		
	}
	
	
}
