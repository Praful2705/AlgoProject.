package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@Column
	private long id;
	@Column
	private long price;
	@Column
	private String name;
	@Column
	private String type;
	@Column
	private String category;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", type=" + type + ", category=" + category
				+ "]";
	}

	public long getProduct() {

		long discount = 0;
		long gst = 0;
		long finalprice = 0;
		long deliverycharge = 0;

		System.out.println("Product ID=" + id);
		System.out.println("Product Name=" + name);
		System.out.println("Product Type=" + type);
		System.out.println("Product Category=" + category);
		System.out.println("Base Price=" + price);

		/* if (Category.equals("Electronics")) {
			discount = (price * 15) / 100;
			System.out.println("discount" + discount);
			gst = (18 * (price - discount)) / 100;
			System.out.println("discount" + discount);
		} else if (Category.equals("Home Appliances")) {
			discount = (price * 22) / 100;
			System.out.println("discount" + discount);
			gst = (24 * (price - discount)) / 100;
			System.out.println("Gst=" + gst);
		} else if (Category.equals("Clothing")) {
			discount = (price * 40) / 100;
			System.out.println("discount" + discount);
			gst = (12 * (price - discount)) / 100;
			System.out.println("Gst=" + gst);
		} else if (Category.equals("Furniture")) {
			discount = (price * 10) / 100;
			System.out.println("discount" + discount);
			gst = (18 * (price - discount)) / 100;
			System.out.println("Gst=" + gst);

		} */

		{
			finalprice = price - discount + gst + deliverycharge;
			return 1;
		}
	}

}
