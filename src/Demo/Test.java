package Demo;

public class Test {
	public static void main(String[] args) {
		Product p1=new Product(11,"handwash",170.4f);
		Product p2=new Product(12,"soap",73.6f);
		Product p3=new Product(13,"towel",70.4f);
		Product p4=new Product(14,"bedsheet",400.4f);
		Product p5=new Product(15,"bag",330.5f);

		Product Pdlist[] = new Product[5];
		Pdlist[0]=p1;
		Pdlist[1]=p2;
		Pdlist[2]=p3;
		Pdlist[3]=p4;
		Pdlist[4]=p5;
		
		for(int i=0;i<Pdlist.length;i++){
			System.out.println("Price of =>"+ Pdlist[i]);

			float n = Pdlist[i].getCost()+ Pdlist[i].getCost()*0.15f;
			Pdlist[i].setCost(n);
			System.out.println("Increased price of product after 15 % discount =>"+ Pdlist[i]);

			float k = Pdlist[i].getCost()-Pdlist[i].getCost()*0.15f;
			Pdlist[i].setCost(k);

			System.out.println("After discount price of =>"+Pdlist[i]);

			System.out.println("===================================");

		}
	}
}