package using_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("category")
public class Category {
	private String categoryName;
	public Category() {};
	public Category(String name) {
		this.categoryName = name;
	}
	
	@Autowired
	public void setCategoryName(@Value("Clothing") String name) {
		System.out.println("Setter");
		this.categoryName = name;
	}
	public String getCategoryName() {
		return this.categoryName;
	}
	public String toString() {
		return "Category: [name: " + categoryName + "]";
	}
}
