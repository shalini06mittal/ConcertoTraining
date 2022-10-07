package com.demo.ReactiveDemo.solution;

import reactor.core.publisher.Flux;

import java.io.IOException;
import java.time.Duration;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        // TODO: Write code here

//        ReactiveSources.intNumbersFluxWithException().subscribe(e->System.out.println(e),
//                err->System.out.println(err));
        
//        ReactiveSources.intNumbersFluxWithException()
//        .doOnError(err->System.out.println(err))
//        .subscribe(e->System.out.println(e));
        
//        Flux<String> flux =Flux.just("Spring","Spring Boot","Reactive Spring1","Reactive Spring2","Reactive Spring3","Reactive Spring4","Reactive Spring5").delayElements(Duration.ofMillis(1500))
//                .concatWith(Flux.error(new RuntimeException("error occurred"))).concatWithValues("hello");
//        
//        flux.subscribe(System.out::println,
//                (e) -> System.out.println(e),
//                () -> System.out.println("complete"));

        
        // Print values from intNumbersFluxWithException and continue on errors
        // TODO: Write code here
        
//        ReactiveSources.intNumbersFluxWithException()
//        .onErrorContinue((err, item)->System.out.println(err))
//        .subscribe(e->System.out.println(e));

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        // TODO: Write code here
        
        ReactiveSources.intNumbersFluxWithException()
        .onErrorResume(err->Flux.just(1,2))
        .subscribe(e->System.out.println(e));


        System.out.println("Press a key to end");
        System.in.read();
    }

}
