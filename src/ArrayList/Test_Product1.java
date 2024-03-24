package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Test_Product1 {
public static void main(String[] args) {
	Product1 p1= new Product1(34,"Pen","Stationary",20);
	Product1 p2= new Product1(11,"Pendrive","Electronics",800);
	Product1 p3= new Product1(78,"mouse","Electronics",1200);
	Product1 p4= new Product1(54,"Pencil","Stationary",10);
	 
	LinkedHashSet<Product1>prodlist=new LinkedHashSet<Product1>();
	prodlist.add(p1);
	prodlist.add(p2);
	prodlist.add(p3);
	prodlist.add(p4);

/*
	 for(int i=0;i<prodlist.size();i++){
			System.out.println(prodlist);
	 }
	 */
for (Product1 product1 : prodlist) {
	System.out.println(product1);
}
		/* Arrays.Sort(prodlist);
		 for(Product1 t: prodlist);
		 System.out.println(t);*/
}
}