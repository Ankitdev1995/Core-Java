package com.ankit.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	}

public class FilterDemo4 {
public static void main(String[] args) {
	
	List<Product> productlist = new ArrayList<Product>();
	productlist.add(new Product(1, "HP", 36000));
	productlist.add(new Product(2, "Dell", 30000));
	productlist.add(new Product(3, "Lenovo", 52000));
	productlist.add(new Product(4, "sony", 67000));
	productlist.add(new Product(5, "Apple", 89000));
	productlist.add(new Product(6, "Asus", 40000));

  // filter the object form this collection based on the price of the product 	
  // if price of the product is greater than 32000 then add this object to some other collection and print it.


	List<Product> list = productlist.stream().filter(s->s.price>39000).collect(Collectors.toList());
	System.out.println(list);

	System.out.println("*********************");

	productlist.stream()
			.filter(p->p.price>60000) // filtering
			.forEach(pr->System.out.println(pr.price)); // iterating

}
}
