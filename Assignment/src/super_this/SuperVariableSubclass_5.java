package super_this;

public class SuperVariableSubclass_5 extends SuperVariableParant_5{
	
		
	int num=110;
	int sum=200;
	
	void printNumber(){
		System.out.println(this.num);
		}
	void displaynumber(){
		System.out.println(super.num);
	}
	
	
	public static void main(String[] args) {
		SuperVariableSubclass_5 obj= new SuperVariableSubclass_5();
		obj.printNumber();
		obj.displaynumber();
	}
}


