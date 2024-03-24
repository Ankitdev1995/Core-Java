package example2;

public class Add_operation {
	
	int add (int x,int y){
		int r=x+y;
		return r;
	}
	
	int mul(int x,int y) {
		int p=x*y;
		
		return p;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	Add_operation obj=new Add_operation();
	int	z=obj.add(2,4);
	System.out.println(z);
	
	System.out.println("=================");
	int p=obj.mul(10, 20);
	System.out.println(p);

	}

}
