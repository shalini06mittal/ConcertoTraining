package com.streamapi;

import java.util.List;

public class City {

	String name;
	List<Temperature> temperatures;
	public City(String name, List<Temperature> temperatures) {
		this.name = name;
		this.temperatures = temperatures;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Temperature> getTemperatures() {
		return temperatures;
	}
	public void setTemperatures(List<Temperature> temperatures) {
		this.temperatures = temperatures;
	}
	@Override
	public String toString() {
		return "City [name=" + name + " :\n temperatures=" + temperatures + "]\n";
	}


}
