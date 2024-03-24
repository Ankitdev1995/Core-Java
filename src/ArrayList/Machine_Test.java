package ArrayList;

import java.util.ArrayList;

public class Machine_Test {
public static void main(String[] args) {
	ArrayList<Machine>m1=new ArrayList<Machine>();
	
	m1.add(new Machine(122,"LENOVO-THINKBOOK",89000));
	m1.add(new Machine(123,"Dell-Inspiron",48000));
	m1.add(new Machine(124,"HP-pavillion",67000));
	m1.add(new Machine(125,"ASUS VivoBOOK",42000)); 
	
	m1.forEach(s->System.out.println(s));
	System.out.println("================");
	
	m1.remove(3);
	
	m1.forEach(System.out::println);
	System.out.println("========");
	
	m1.stream().forEach(s->System.out.println(s));
	
	System.out.println("====filter=======");
	 
	m1.stream().filter(s->s.getPrice()>85000.0f).forEach(s->System.out.println(s));
	
	System.out.println("========FIlter=count==========");
		System.out.println(m1.stream().filter(s->s.getPrice()>45000).count());
	
}
}