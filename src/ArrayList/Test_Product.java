package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Test_Product {
	public static void main(String[] args) {
		
	Product p1=new Product(10,"pen",20.4f);
	Product p2=new Product(20,"pencil",23.8f);
	Product p3=new Product(30,"sharpner",21.4f);
	Product p4=new Product(40,"marker",40.64f);
	Product p5=new Product(50,"textbook",34.4f);
	
	ArrayList<Product>list=new ArrayList<Product>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
	
	System.out.println("=======for=======");
	for(int i=0;i<list.size();i++){
	System.out.println(list.get(i));
	}
	System.out.println("======Enhanced for=======");
	for(Product t:list){
		System.out.println(t);
	}  
	System.out.println("=====only Forward Iterator====");
	Iterator<Product>itr=list.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	System.out.println("======Forward Backward Both=====");
	
	ListIterator<Product>listitr=list.listIterator();
	while(listitr.hasNext())
	System.out.println(listitr.next());
	System.out.println("====================");
	
	while(listitr.hasPrevious())
		System.out.println(listitr.previous()); 
	
	
	System.out.println("=====Using enumerator");
		Enumeration<Product>plist=Collections.enumeration(list);
		while(plist.hasMoreElements())
			System.out.println(plist.nextElement());
		
	System.out.println("=======Using For Each==========");
		list.forEach(v->System.out.println(v));
	
		System.out.println("====Using Static(For Each)=====");
		list.forEach(System.out::println);
	}
	}
