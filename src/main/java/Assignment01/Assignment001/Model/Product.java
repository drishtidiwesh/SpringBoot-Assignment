package Assignment01.Assignment001.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String color;
	
	
	
	public Product(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public Product() {
		
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getid() {
		return id;
	}
}
