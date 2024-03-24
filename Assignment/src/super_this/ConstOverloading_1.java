package super_this;

public class ConstOverloading_1 {
	int value1;
	int value2;

	ConstOverloading_1(){
	value1=10;
	value2=20;
	System.out.println("Inside 1st Constructor");
}

	ConstOverloading_1(int a){
	value1=a;
	System.out.println("Inside 2nd Constructor");
	}
	ConstOverloading_1(int a,int b){
	value1=a;
	value2=b;
	System.out.println("Inside 3rd Constructor");
}
	public void display(){
		System.out.println("Value1===" + value1);
		System.out.println("Value2===" + value2);
	}
	
	public static void main(String[] args) {
		ConstOverloading_1 d1=new ConstOverloading_1();
		ConstOverloading_1 d2=new ConstOverloading_1(30);
		ConstOverloading_1 d3=new ConstOverloading_1(30,40);
				d1.display();
				d2.display();
				d3.display();
				
				
				
	}			
	}