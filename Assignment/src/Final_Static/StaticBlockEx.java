package Final_Static;

public class StaticBlockEx {
	static int a;
	static int b;
	static{
		System.out.println("Static Block Called");
			a=10;
			b=20;
	}	
	
	
		public static void main(String[] args) {
	
		System.out.println("Main method started");
		System.out.println(a);
		System.out.println(b);
		
		}
		}