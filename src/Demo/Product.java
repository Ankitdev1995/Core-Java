package Demo;

public class Product {
	
	int id;
	String name;
	float cost;
	
	Product(){

	}
	Product(int id,String name,float cost){
		super();
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public float getCost(){
		return cost;
	}	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCost(float cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

	
//	@Override
//	public String toString(){
//		String t=(id+" no"+" "+name+" "+ "is"+"==="+" "+cost+" ");
//		return t;
//
//	}
}