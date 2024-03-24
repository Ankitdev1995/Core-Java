package chapter1;

public class Product {
	int id=101;
	String name="Pencil";
	String Category="Stationary";
	float price=100.70f;

	void m1(int id,String name,String Category,float price){
			
		System.out.println(id);
		System.out.println(name);
		System.out.println(Category);
		System.out.println(price);
		System.out.println("====================");
		
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.Category);
		System.out.println(this.price);
		}
}
