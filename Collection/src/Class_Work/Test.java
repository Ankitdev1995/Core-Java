package Class_Work;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	
	Student s1=new Student(101,"Ajay",87.5f,"BE");
	Student s2=new Student(102,"Anil",77.5f,"ME");
	Student s3=new Student(103,"Pranil",70.5f,"JAVA");
	Student s4=new Student(104,"Sanju",90.5f,"SELENIUM");
	Student s5=new Student(105,"Raman",60.5f,"PYTHON");

	HashMap<Integer,Student> hm = new HashMap<Integer,Student>();

	hm.put(105, s1);
	hm.put(102, s2);
	hm.put(103, s3);
	hm.put(101, s4);
	hm.put(104, s5);

	Set<Entry<Integer,Student>>entries = hm.entrySet();
	
	for(Entry<Integer,Student> entry:entries){
		
		System.out.println(entry.getKey()+" " +entry.getValue());
	}	
}
}