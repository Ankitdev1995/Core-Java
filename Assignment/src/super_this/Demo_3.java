package super_this;


public class Demo_3 {
	int value1;
	int value2;
	
	Demo_3(){
		 value1=10;
		 value2=20;
		System.out.println("Inside Constructor");
	}
		
		public void display(){
			System.out.println("Value1====" +value1);
			System.out.println("Value2====" +value2);
		}
		
	public static void main(String[] args) {
		Demo_3 d1=new Demo_3();
		d1.display();
	}	
	}

