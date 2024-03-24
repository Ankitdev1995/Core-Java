package Class_Work;

import java.util.Comparator;

public class ProductCostComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return new Float(p1.cost).compareTo(p2.cost);
	}
	
	}
