package com.concerto.demos.SpringCoreDemo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {
	
	@Value("1")
	private int aid;
	@Value("Shalini Mittal")
	private String name;
	@Value("Suspense")
	private String genre;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}


	public Author(int aid, String name, String genre) {
	System.out.println("Author param const");
		this.aid = aid;
		this.name = name;
		this.genre = genre;
	}



	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", genre=" + genre + "]";
	}
	

}
