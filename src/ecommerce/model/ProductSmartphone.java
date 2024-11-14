package ecommerce.model;

public class ProductSmartphone extends Product {
	
	private String oS;
	private String brand;
	
	public ProductSmartphone(String name, float preço, int stock, String description, String category, float price, String oS, String brand) {
		super(name, stock, description, "Smartphone", price);
		this.oS = oS;
		this.brand = brand;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	@Override
	public void display() {
		super.display();
		
		System.out.println("**********************************************************************");
		System.out.println("Marca: " + this.brand);
        System.out.println("Sistema Operacional: " + this.oS);
        System.out.println("**********************************************************************");
		
	}

}
