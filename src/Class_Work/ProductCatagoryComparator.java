package Class_Work;

import java.util.Comparator;

public class ProductCatagoryComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return (p1.catagory).compareTo(p2.catagory);
	}
	

}
