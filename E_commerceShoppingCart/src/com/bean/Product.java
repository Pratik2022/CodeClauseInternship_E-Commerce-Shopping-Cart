//E-commerce Shopping Cart//

package com.bean;

import java.util.Objects;

public class Product
{
	protected int id;
	protected String name;
	protected double price;
	
	public Product()  //Default constructor
	{
		this.id = 0;
		this.name = "NA";
		this.price = 0.0f;
	}
	
	public Product(int id,String name,double price) //Parameterized constructor
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setId(int id) {           //setter for Id
		this.id = id;
	}
	
	public void setName(String name) {     //setter for Name
		this.name = name;
	}
	
	public void setPrice(double price) {        //setter for Price
		this.price = price;
	}
	
	public int getId() {         //Getter for Id
		return id;
	}

	public String getName() {      //Getter for Name
		return name;
	}

	public double getPrice() {        //Getter for Price
		return price;
	}

	@Override
	public int hashCode() {               
		return Objects.hash(id, name, price);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	

}
