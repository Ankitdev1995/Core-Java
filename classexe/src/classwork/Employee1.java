package classwork;

public class Employee1 {
public static void main(String[] args) {
	Employee E1=new Employee();
	Employee E2=new Employee();
	Employee E3=new Employee();
  
    E1.empid=101;
    E1.ename="Amar";
    E1.basic_salary=10000;
    E1.salary();
    
    
    E2.empid=102;
    E2.ename="Ankit";
    E2.basic_salary=20000;
    E2.salary();
    
    
    E3.empid=103;
    E3.ename="Amit";
    E3.basic_salary=30000; 
    E3.salary();
    
    System.out.println("Employee id is:"+E1.empid);
    System.out.println("Employee name is:"+E1.ename);
    System.out.println("Employee salary is:"+E1.salary);
    
    
    System.out.println("Employee id is:"+E2.empid);
    System.out.println("Employee name is:"+E2.ename);
    System.out.println("Employee salary is:"+E2.salary);
    
	System.out.println("Employee id is:"+E3.empid);
	System.out.println("Employee name is:"+E3.ename);
	System.out.println("Employee salary is:"+E3.salary); 
}
}