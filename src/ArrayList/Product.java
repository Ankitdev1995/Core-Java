package ArrayList;

public class Product {
int pid;
String pname;
float price;

public Product(int pid,String pname,float price){

	this.pid=pid;
	this.pname=pname;
	this.price=price;
	}
	public int getPid(){
	return pid;
	}
	public void setPid (int pid){
	this.pid=pid;
	}
	public String getpname(){
		return pname;
	}
	public void setPname(String pname){
		this.pname=pname;
	}
	public float getPrice(){
		return price;
	}
	public void setPrice(float price){
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}
