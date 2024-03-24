package Class_Work;

import java.util.ArrayList;
import java.util.Collections;


public class Test {
public static void main(String[] args) {
	Product p1=new Product(34,"pen","stationary",20);
	Product p2=new Product(11,"pendrive","electronics",800);			
	Product p3=new Product(78,"mouse","electronics",1200);
	Product p4=new Product(54,"pencil","stationary",10);

		ArrayList<Product>prodlist=new ArrayList<Product>();
		prodlist.add(p1);
		prodlist.add(p2);	
		prodlist.add(p3);
		prodlist.add(p4);
			

		Collections.sort(prodlist);
		System.out.println("=======Using comparable=========");
		prodlist.forEach(s-> System.out.println(s));
		
		System.out.println("====Using Comparator:Cost==========");
		Collections.sort(prodlist, new ProductCostComparator());
		prodlist.forEach(s->System.out.println(s));
	
		System.out.println("====Using Comparator:Catagory==== ");
		Collections.sort(prodlist, new ProductCatagoryComparator());
		prodlist.forEach(s->System.out.println(s));
		
		System.out.println("=======Using Comparator:Name=======");
		Collections.sort(prodlist, new ProductNameComparator());
		prodlist.forEach(s->System.out.println(s));

}
}