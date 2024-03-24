package super_this;

public class Chaining_7 {
	
	public Chaining_7(){
		System.out.println("Default Constructor");
		}
		public Chaining_7(String str){
			this();
			System.out.println("Parametrized constructor with single parameter");
		}
		public Chaining_7(String str,int num){
			// It will call the constructor with String argument
			this("Hello");
			System.out.println("Parametrized constructor with double args");
		}
		public Chaining_7 (int num1, int num2,int num3){
			// It will call the constructor with (String, integer) arguments
			this("Hello",2);
			System.out.println("Parametrized constructor with three args");
			}
		
		
		
		
		public static void main(String[] args) {
			// Creating an object using Constructor with 3 int arguments
			Chaining_7 obj=new Chaining_7 (5,50,15);
		}
		}
	

