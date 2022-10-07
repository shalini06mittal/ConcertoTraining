package com.demo.ReactiveDemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveFluxEx {

	public static void main(String[] args) throws IOException {
		
		Flux<String> data = Flux.just("One","Two","Three","Three")
				.delayElements(Duration.ofSeconds(1))
				.log();
		
		data.subscribe(item -> System.out.println(item.toUpperCase()));
		
		System.out.println("enter any key to end");
		System.in.read();
		System.out.println("main ends");
	}

}
