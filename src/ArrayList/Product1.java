package ArrayList;

public class Product1 {
int id;
String name;
String Category;
float cost;
@Override
public String toString() {
	return "Product1 [id=" + id + ", name=" + name + ", Category=" + Category + ", cost=" + cost + "]";
}
public Product1(int id, String name, String category, float cost) {
	super();
	this.id = id;
	this.name = name;
	Category = category;
	this.cost = cost;
}

}

