package com.demo.ReactiveDemo;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
    	

//    	ReactiveSources.intNumberMono()
//    	.subscribe(d->System.out.println(d),
//    			e->System.out.println(e),
//    			()-> System.out.println("done"));
    	
    	
        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

    	ReactiveSources.stringNumbersFlux().log()
    	.subscribe(new MySubscriber());
    	
        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber extends BaseSubscriber<String>
{
	
	@Override
	protected void hookOnSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
		System.out.println("subscribed");
		request(3);
	}
	
	@Override
	protected void hookOnComplete() {
		// TODO Auto-generated ms
		System.out.println("complete");
	}
	@Override
	protected void hookOnNext(String value) {
		// TODO Auto-generated method stub
		System.out.println("on next data --> "+value);
		request(3);
	}
	

}





