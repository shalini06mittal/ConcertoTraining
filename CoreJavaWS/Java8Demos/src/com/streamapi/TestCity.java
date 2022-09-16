package com.streamapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	}

}
