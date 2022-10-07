package com.demo.ReactiveDemo.solution;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
//    	ReactiveSources.intNumbersFlux().subscribe(
//    			e->System.out.println(e),
//    			err->System.out.println(err),
//    			()->System.out.println("complete")
//    			);

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

    	ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<Integer>());
    	
        System.out.println("Press a key to end");
        System.in.read();
    }

}

// need to as for an item otherwise the items wont be recieved
// allows to control how much data you need using request()
class MySubscriber<T> extends BaseSubscriber<T>
{
	
	@Override
	protected void hookOnSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
		System.out.println("Subscribe happened");
		request(1);
	}
	
	@Override
	protected void hookOnNext(T value) {
		// TODO Auto-generated method stub
		System.out.println(value+" recieved");
		request(1);
	}
	
	
	@Override
	protected void hookOnError(Throwable throwable) {
		// TODO Auto-generated method stub
		System.out.println(throwable.getMessage());
	}
	
	@Override
	protected void hookOnComplete() {
		// TODO Auto-generated method stub
		System.out.println("complete");
	}
}