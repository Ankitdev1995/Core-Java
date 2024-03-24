package Functional_Interface;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	Product p1=new Product(101,"PC","Electronics",24000);
	Product p2=new Product(102,"TEXT BOOKS","Stationary",4500);
	Product p3=new Product(103,"Fan","Electrical",22000);
	Product p4=new Product(104,"SofaSet","Furniture",26000);
	Product p5=new Product(105,"Spoons","Utensils",900);
	Product p6=new Product(106,"TV","Electronics",52000);
	Product p7=new Product(106,"BAG","Stationary",2700);
		
		
	ArrayList<Product> prodlist =new ArrayList<Product>();
	
	prodlist.add(p1);
	prodlist.add(p2);
	prodlist.add(p3);
	prodlist.add(p4);
	prodlist.add(p5);
	prodlist.add(p6);
	prodlist.add(p7);	
	
	prodlist.forEach(z->System.out.println(z));
		
	System.out.println("===cost > 700===");
		
	prodlist.stream().filter(p->p.getPrice()>20000).
	forEach(p->System.out.println(p));
	
	System.out.println("==Stationary Whose price >2500=====");
		
	prodlist.stream()
	.filter(a->a.getPrice()>2500)
	.filter(a->a.getCatagory()
	.equals("Stationary"))
	.forEach(a->System.out.println(a));
		
	System.out.println("===Price increased by 20%");
		
	prodlist.forEach(s->{
	s.price=s.price+s.price*0.2f;
	System.out.println(s);
	});	
	}
}