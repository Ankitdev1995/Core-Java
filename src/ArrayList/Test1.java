package ArrayList;

import java.util.ArrayList;

public class Test1 {
public static void main(String[] args) {
	Employee1 e1 =new Employee1(101,"Sam","CEO",700000);
	Employee1 e2 =new Employee1(102,"nisha","HR",150000);
	Employee1 e3 =new Employee1(103,"ram","Developer",120000);
	Employee1 e4 =new Employee1(104,"salman","Tester",100000);
	Employee1 e5 =new Employee1(105,"anthony","manager",500000);

		ArrayList<Employee1>list=new ArrayList<Employee1>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
		
		
		
		 for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
		 }
		 for(Employee1 t:list){
			 if(t.disignation.equals("Tester"))
				 t.salary=t.salary+(t.salary*0.1);
		 
		 else if(t.disignation.equals("Developer"))
			 t.salary=t.salary+(t.salary*0.2);
			 	
		 else if(t.disignation.equals("manager"))	 
			 t.salary=t.salary+(t.salary*0.3);
			 
			 System.out.println(t.salary);
		 }

}
}