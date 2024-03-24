package ArrayList;

public class Fruits {
int id;
String name;
String flavour;
float price;
String Produce_district;
public Fruits() {
	super();
	
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
public String getFlavour() {
	return flavour;
}
public void setFlavour(String flavour) {
	this.flavour = flavour;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getProduce_district() {
	return Produce_district;
}
public void setProduce_district(String produce_district) {
	Produce_district = produce_district;
}
public Fruits(int id, String name, String flavour, float price, String produce_district) {
	super();
	this.id = id;
	this.name = name;
	this.flavour = flavour;
	this.price = price;
	Produce_district = produce_district;
	
}
@Override
public String toString() {
	return "Fruits [id=" + id + ", name=" + name + ", flavour=" + flavour + ", price=" + price + ", Produce_district="
			+ Produce_district + "]";
}

}
