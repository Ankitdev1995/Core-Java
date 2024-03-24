package Polymorphism;

public class BindDynamic {
	
	protected String val;
	
	void display(String str){
		val="Base Class function".concat(str);
		System.out.println(val);
	}
}
