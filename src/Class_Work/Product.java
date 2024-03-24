package Class_Work;

public class Product implements Comparable<Product>{
int id;
String name;
String catagory;
float cost;
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", catagory=" + catagory + ", cost=" + cost + "]";
}
public Product(int id, String name, String catagory, float cost) {
	super();
	this.id = id;
	this.name = name;
	this.catagory = catagory;
	this.cost = cost;
}
@Override
public int compareTo(Product p1) {
	
	return new Integer(this.id).compareTo(p1.id);
}
}