package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Doctor_Test {
public static void main(String[] args) {
	Doctor d1=new Doctor(1234,"Prashant","ENT",70000);
	Doctor d2=new Doctor(1235,"Pranil","Piles",75000);	
	Doctor d3=new Doctor(1236,"Jiwan","Nurologist",60000);
	Doctor d4=new Doctor(1237,"Sneha","Cardiologist",78000);
	Doctor d5=new Doctor(1238,"Pranjali","Gynacologist",93000);

	ArrayList<Doctor>al=new ArrayList<Doctor>();
	al.add(d1);
	al.add(d2);
	al.add(d3);
	al.add(d4);
	al.add(d5);
	
	 for(Doctor d:al){
	 if(d.dRegNo<=1236)
		System.out.println(d.salary+10000);
	else
		System.out.println(d.salary+5000);
	}
	 for(int i=0;i<al.size();i++){
	System.out.println(al.get(i));
	}
	System.out.println("==================");
	
	al.forEach(System.out::println);
	System.out.println("===================");
	
	al.forEach(d->System.out.println(d));

	System.out.println("===================");
	Iterator<Doctor>itr=al.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	System.out.println("=======================");
	
	for(Doctor t:al){
		System.out.println(t);
	}
	System.out.println("=========FOr BAc==============");
	
	ListIterator<Doctor>lstr=al.listIterator();
	while(lstr.hasNext())
		System.out.println(lstr.next()); 
}
}