package com.demo.ReactiveDemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Mono;

public class ReactiveMonoEx {

	public static void main(String[] args) throws IOException {
		
		Mono<String> data = Mono.just("One")
				.delayElement(Duration.ofSeconds(1))
				.log();
		data.subscribe(
				item -> System.out.println(item.toUpperCase()),
				err -> System.out.println("error"),
				()->System.out.println("done"));
		
		System.out.println("enter any key to end");
		System.in.read();
		System.out.println("main ends");
	}

}
