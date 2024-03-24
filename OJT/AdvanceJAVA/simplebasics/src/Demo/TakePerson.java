package Demo;

import java.util.ArrayList;

public class TakePerson {
	void takePersonDetails(){
		TransactPerson tp=new TransactPerson();
	ArrayList<Person>listPerson=tp.loadPersons();
	for (Person person : listPerson) {
	System.out.println(person);
		
		if(person.getLoc().equals("nagpur")){
		System.out.println("Age of person who belongs to nagpur==>"+person.getAge());
	
	}
	
	}
	}
}