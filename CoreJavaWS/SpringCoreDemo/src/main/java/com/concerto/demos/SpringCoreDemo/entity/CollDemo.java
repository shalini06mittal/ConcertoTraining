package com.concerto.demos.SpringCoreDemo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class CollDemo {

	//@Autowired
	List<String> fruits;
	@Autowired
	Set<String> certificates;
	@Autowired
	Map<String, Integer> map;
	@Autowired
	@Qualifier("list")
	List<Author> authors;
	
	public CollDemo() {
		System.out.println("Coll const");
	}
	public List<String> getFruits() {
		return fruits;
	}
	@Autowired
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	public Set<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(Set<String> certificates) {
		this.certificates = certificates;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	
	
}
