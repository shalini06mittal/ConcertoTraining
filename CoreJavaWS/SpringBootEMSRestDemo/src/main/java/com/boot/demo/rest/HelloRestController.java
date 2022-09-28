package com.boot.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.entity.Author;
//SOAP (XML) vs REST (Architecture )
	// Representational State Transfer
	// webservice => REST API
	/**
	 * 
	 * URL -> http://localhost:8080/getWeather.html
	 * 
	 * NOUN / Verbs ( http methods)
	 * URI => http://localhost:8080/weather
	 * 
	 * 
	 * HTTP methods -> verbs
	 * GET -> fetch
	 * POST -> insert
	 * PUT -> update
	 * DELETE -> delete
	 * 
	 * HTTP Status
	 * 1xx
	 * 2xx
	 * 3xx
	 * 4xx
	 * 5xx
	 * 
	 * Http headers
	 */
@RestController
@RequestMapping("/rest")
public class HelloRestController {

	@GetMapping
	public String getData()
	{
		return "{\"message\":\"fetching data\"}";
	}
	@GetMapping("/list")
	public List<String> getListData()
	{	
		return Arrays.asList("India","UK","USA");
	}
	//import org.springframework.http.MediaType;
	@GetMapping(path = "/authors", 
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Author> getAuthorsData()
	{
		
		return Arrays.asList(new Author(1, "JK Rowling"),new Author(2, "Syndney Sheldon"));
	}
	//http://localhost:8080/rest/20
	// path parameter
	@GetMapping("/{id}")
	public Author getAuthorById(@PathVariable int id)
	{
		System.out.println("Id "+id);
		Author author = new Author();
		author.setAid(id);
		author.setName("Dummy nme");
		//String message = "fetching "+id;
		return author;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String postData()
	{
		return "{\"message\":\"inserting data\"}";
	}
	@PutMapping
	public String updateData()
	{
		return "{\"message\":\"updating data\"}";
	}
	@DeleteMapping
	public String deleteData()
	{
		return "{\"message\":\"deleting data\"}";
	}
}
