package com.techgatha.demo;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class MonoController {

	@GetMapping("/mono")
	public Mono<String> message()
	{
		//return computeMessage();
		
		return computeMessage()
		.zipWith(getName())
		.map((value)-> value.getT1() + value.getT2());
	}
	
	private Mono<String> computeMessage()
	{
		return Mono.just("Heyy Happy Learning")
		.delayElement(Duration.ofSeconds(10)).log();
	}
	
	private Mono<String> getName()
	{
		return Mono.just("Shalini")
		.delayElement(Duration.ofSeconds(10)).log();
	}
	
}
