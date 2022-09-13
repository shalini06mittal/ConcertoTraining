package com.lamdbdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apples","oranges","banana","cherries","grapes");
		Collections.sort(fruits);
		System.out.println(fruits);
		List<Product> products = Arrays.asList(
				new Product(1, "Laptop M1", "Apple", 5678.90),
				new Product(3, "Mouse", "Samsung", 7891231.00),
				new Product(2, "Speakers", "Boat", 23823.98),
				new Product(4, "Laptop OSX", "Apple", 179878.89)
				);
		for(Product p : products)
			System.out.println(p);
		Collections.sort(products);
		System.out.println();
		for(Product p : products)
			System.out.println(p);
//		Collections.sort(products, new Comparator<Product>() {
//			@Override
//			public int compare(Product o1, Product o2) {
//				return o1.getPrice().compareTo(o2.getPrice());
//				//return o1.getPrice() - o2.getPrice();
//			}
//		});
		// default asc => 1st para compare with 2nd para
		Collections.sort(products, (p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		System.out.println();
		for(Product p : products)
			System.out.println(p);
		
		// default desc => 2nd para compare with 1st para
				Collections.sort(products, (p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));
				System.out.println();
				for(Product p : products)
					System.out.println(p);
		
	}

}
