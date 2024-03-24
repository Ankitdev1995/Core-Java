package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
public static void main(String[] args) {
	Employee e1=new Employee(11,"Ram","manager","22march",5000000);
	Employee e2=new Employee(12,"Raj","CEO","23march",30000000);
	Employee e3=new Employee(13,"rahul","JE","24march",700000);
	Employee e4=new Employee(14,"raja","AE","25march",50000);
	Employee e5=new Employee(15,"Radha","Developer","26march",56000000);

	ArrayList<Employee>list=new ArrayList<Employee>();
			list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
			 
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
			System.out.println("===============");
			for(Employee t:list){
				System.out.println(t);
			}
				System.out.println("===============");
			Iterator<Employee> itr=list.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			}
}
	