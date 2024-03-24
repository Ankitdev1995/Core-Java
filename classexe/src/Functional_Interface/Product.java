package Functional_Interface;

public class Product {
	
int id;
String name;
String Catagory;
float price;
public Product(int id, String name, String catagory, float price) {
	super();
	this.id = id;
	this.name = name;
	this.Catagory = catagory;
	this.price = price;

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCatagory() {
	return Catagory;
}
public void setCatagory(String catagory) {
	Catagory = catagory;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", Catagory=" + Catagory + ", price=" + price + "]";
}
}
