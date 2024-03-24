package super_this;

public class SuperExpliciteSubclass_11 extends SuperExplicitParent_11{
	SuperExpliciteSubclass_11(){
		
		super();
		System.out.println("Constructor of Subclass");
		}
	void display(){
		System.out.println("Hello");
		}
	public static void main(String[] args) {
		SuperExpliciteSubclass_11 obj=new SuperExpliciteSubclass_11();
			obj.display();
	}
}
