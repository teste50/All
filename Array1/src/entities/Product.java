package entities;

public class Product {
	
	private String name;
	private double price;
	
	// Constructor	this class
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//	Name getters and setters
	
	public  String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	//	Price getters and setters
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return name +" " + price;
	}
}
