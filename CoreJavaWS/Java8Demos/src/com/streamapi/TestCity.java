package com.streamapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class TestCity {

	
	public static void main(String[] args) {

		
		List<City> cities = PrepareData.prepareData(5,5);
		for(City city:cities)
			System.out.println(city);
		System.out.println();
		
		//	Generate a stream on this collection and 
		// display the list of City along with temperatures reading
		
		
		cities.stream()
		.map(city->{
			HashMap<String, List<BigDecimal>> map= new HashMap<String, List<BigDecimal>>();
			map.put(city.getName(), 
					city.getTemperatures().stream()
					.map(temp -> temp.getReading())
					.collect(Collectors.toList()));
			return map;
		}).forEach(System.out::println);
		
		// below code is if data needs to be stored in a map
		LinkedHashMap<String, List<BigDecimal>> map1 = 
				cities.stream()
		.map(city->{
			HashMap<String, List<BigDecimal>> map= new HashMap<String, List<BigDecimal>>();
			map.put(city.getName(), 
					city.getTemperatures().stream()
					.map(temp -> temp.getReading())
					.collect(Collectors.toList()));
			return map;
		}).flatMap(map -> map.entrySet().stream())
		.collect(Collectors.toMap(
              Map.Entry::getKey,
              Map.Entry::getValue,
              (v1, v2) -> v1, // merge function to handle possible duplicates
              LinkedHashMap::new
      ));
		
		System.out.println(map1);
		
		//	Generate a stream on this collection and
		// display the list of cities whose name starts with A
		
		System.out.println();
		System.out.println("Names starts with A");
	
		cities.stream().filter(city -> city.getName().startsWith("A"))
		.forEach(System.out::println);
		
		// Generate a stream on this collection and display the names 
		// of cities in upper case
		System.out.println();
		System.out.println("Names in upper case");
	
		cities.stream().map(city -> city.getName().toUpperCase())
		.forEach(System.out::println);
		
		//•	Generate a stream on this collection and 
		// display the names of cities that has temperature below 10 deg cel.
		System.out.println();
		System.out.println("Temp Below 10");
		cities.stream().filter(city ->
			city.getTemperatures().stream().anyMatch(temp -> temp.getReading().compareTo(new BigDecimal(10.0)) < 0)
				)
		.forEach(city -> System.out.println(city.getName()));
		
		//	Generate a stream on this collection and display the average temperature for the month of August.
		System.out.println();
		double avg = cities.stream().flatMap(city -> city.getTemperatures().stream())
		.filter(temp -> temp.getDate().getMonth() >= 7)
		.mapToDouble(temp -> temp.getReading().doubleValue())
		.average().getAsDouble();
		System.out.println(avg);
		
	}

}
