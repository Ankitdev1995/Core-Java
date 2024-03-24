package Encapsulation;

public class EncapsTest {
public static void main(String[] args) {
	EncapsulationDemo obj=new EncapsulationDemo();
	obj.setEmpAge(40);
	obj.setEmpName("raja");
	obj.setSsn(4223);
	
	System.out.println("employee name:"+ obj.getEmpName());
	System.out.println("Employee ssn:"+ obj.getSsn());
	System.out.println("Employee Age:"+obj.getEmpAge());
	
}
}
