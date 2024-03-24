package super_this;


public class ConstructorCallSubclass_8 extends ConstructorCallParent_8 {
	
	ConstructorCallSubclass_8(){
		System.out.println("Constructor of Subclass");
	}	
		ConstructorCallSubclass_8(int num){
			System.out.println("Constructor with arg");
		}
	
		void display(){
		System.out.println("Hello");
		
	}
	
		public static void main(String[] args) {
			
	
	ConstructorCallSubclass_8 obj=new ConstructorCallSubclass_8();
	obj.display();
	}
}
