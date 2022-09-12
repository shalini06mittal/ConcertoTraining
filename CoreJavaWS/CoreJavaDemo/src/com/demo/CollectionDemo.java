package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		/**
		 * List => duplicates, ordered
		 * Set => NOT duplicates , unordered
		 * Map => key-value "c1":3
		 * 34567896788
		 * street: Gandhi
		 * 34567896788
		 */
		List<Integer> prices = new ArrayList<>();
		prices.add(4578);
		prices.add(4578);
		//prices.add("akjsdh");
		
		for(int i=0;i<prices.size();i++)
			System.out.println(prices.get(i) * 10);
		
		Set fruits = new HashSet<>();
		fruits.add("apples");
		fruits.add(10);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("", 0);
	}

}
