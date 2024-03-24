package Class_Demo;

import java.io.Serializable;

public class Product implements Serializable,Comparable,Cloneable{
private int id;
private String name;
private String category;
private float price;

public Product(int id, String name, String category,float price) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.price=price;
	
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
public String getcategory() {
	return category;
}
public void setcategory(String category) {
	this.category = category;
}
public float getprice() {
	return price;
}
public void setprice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
}
@Override
	public int compareTo(Object o) {
			Product s = (Product)o;
		if(this.id>s.id)
			return 1;
			else if(this.id<s.id){
				return -1;
			}
			else
		return 0;
	}
	@Override
		public Object clone() throws CloneNotSupportedException {
			return id;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
	}
