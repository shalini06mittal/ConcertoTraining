package com.concerto.demos.SpringCoreDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDB {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppDB.class);

	}

}
