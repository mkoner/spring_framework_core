package using_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	private Category category;
	private double price;
	public Product() {};
	public Product(Category category, double price) {
		this.category = category;
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	@Autowired
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "Product: [price: " + price + ", category: " + category + "]";
	}
}
