package Room;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Employee_Test {
	public static void main(String[] args) throws Exception {
		// CAN USE hASHmAP --> 
		ArrayList<Employee>c=new ArrayList<Employee>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter Your Choice: ");
			choice=s.nextInt();

			 
			switch(choice){
		
				
			case 1:
				System.out.print("Enter Empno: ");
				int empno=s.nextInt();

				System.out.print("Enter Empname: ");
				String ename=s1.nextLine();

				System.out.print("Enter Salary: ");
				int salary=s.nextInt();
				
				c.add(new Employee(empno,ename,salary));
			
				
				break;

			case 2:
				System.out.println("===================");
				Iterator<Employee>i=c.iterator();
				
				
				while(i.hasNext()){
					Employee e= i.next();
					System.out.println(e);
				}
				System.out.println("=================");
				break; 


			case 3:
				boolean found = false;
				System.out.println("Enter Empno to search :");
				empno=s.nextInt();
				System.out.println("============");
				i=c.iterator();
				
				while(i.hasNext()){
					Employee e =i.next();
					if(e.getEmpno()== empno){
						System.out.println(e);
						found =true;
					}
				}
				if(!found){	
					System.out.println("Record not found");
				}
				System.out.println("=================");
				break; 

			case 4:
				found = false;
				System.out.println("Enter Empno to Delete :");
				empno=s.nextInt();
				System.out.println("============");
				i=c.iterator();
			
				
				while(i.hasNext()){
					Employee e =i.next();
					if(e.getEmpno()== empno){
						i.remove();
						found =true;
					}
				}
				if(!found){	
					System.out.println("Record not found");
				}else{
					System.out.println("Record is deleted");
				}
				System.out.println("================");
				break; 


			case 5:
				found = false;
				System.out.println("Enter Empno to update :");
				empno=s.nextInt();
				System.out.println("============");
				ListIterator<Employee>li=c.listIterator();
				
				
				while(li.hasNext()){
					Employee e =li.next();
					if(e.getEmpno()== empno){
						System.out.println("Enter a new Name");
						ename =s1.nextLine();
						
						System.out.println("Enter a new Salary");
						salary =s.nextInt();
						li.set(new Employee(empno,ename,salary));
						found =true;
					}
				}
				if(!found){	
					System.out.println("Record not found");
				}else{
					System.out.println("Record is updated");
				}
				System.out.println("================");
				break; 
			}
		}while(choice!=0);

	}
}

