package Class_Demo1;

	import java.io.Serializable;

	public class Product implements Serializable,Comparable<Product>,Cloneable{
		
	private int id;
	private String name;
	private String Catagory;
	private float cost;
	public Product(int id, String name, String Catagory, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.Catagory=Catagory;
		this.cost = cost;
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
	public void setCatagory(String Catagory) {
		this.Catagory = Catagory;
	}
	public float getcost() {
		return cost;
	}
	public void setcost(float cost) {
		this.cost = cost;
	}
		@Override
			public int compareTo(Product p) {
			if(this.getId()>p.getId())
				return 1;
			else if(p.getId()>this.getId()){
				return -1;
			}else
			return 0;
			}
		@Override
			public boolean equals(Object obj) {
				Product e=(Product)obj;
				if(this.id==e.getId()&&
				this.name.equals(e.getName())&&
				this.Catagory.equals(e.getCatagory())&&
				this.getcost()==e.getcost())
					
					return true;
				else
					return false;
		
		}
		@Override
			public int hashCode() {
				return super.hashCode();
			
			}
		@Override
			public Object clone() throws CloneNotSupportedException {
				
				return super.clone();
			}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", Catagory=" + Catagory + ", cost=" + cost + "]";
		}

	}


