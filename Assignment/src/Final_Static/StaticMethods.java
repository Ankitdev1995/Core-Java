package Final_Static;

public class StaticMethods {
	private String name;
	private  static String staticStr="STATIC-STRING";
	
	 public StaticMethods(String n){
		this.name=n;
	}
		public  static void	testStaticMethod(){
			System.out.println("Hey... I am in static method..");
		
			System.out.println(StaticMethods.staticStr);
			}
		
		public void testObjectMethod(){
			System.out.println("Hey... I am not-static method..");
			
			System.out.println(StaticMethods.staticStr);
			
			System.out.println("Name:"+this.name);
		}
			
}
