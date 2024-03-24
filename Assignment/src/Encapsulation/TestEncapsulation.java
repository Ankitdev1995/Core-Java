package Encapsulation;

public class TestEncapsulation {
public static void main(String[] args) {
	Encapsulate obj=new Encapsulate();
	obj.setName("Harsh");
	obj.setRoll(19);
	obj.setAge(51);
	
	System.out.println("name:"+obj.getName());
	System.out.println("age:"+obj.getAge());
	System.out.println("Roll:"+obj.getRoll());

}
}
