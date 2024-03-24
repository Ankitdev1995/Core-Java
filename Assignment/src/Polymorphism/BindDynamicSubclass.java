package Polymorphism;

public class BindDynamicSubclass extends BindDynamic{
	
	 void display(String str){
		 if(val==null){
			 str="derived Class Function".concat(str);
			 System.out.println(str);
		 }
	 }
}
