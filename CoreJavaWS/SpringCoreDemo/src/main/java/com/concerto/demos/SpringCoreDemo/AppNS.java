package com.concerto.demos.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.concerto.demos.SpringCoreDemo.entity.Author;
import com.concerto.demos.SpringCoreDemo.entity.Book;

/**
 * Hello world!
 *
 */
public class AppNS 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new
        		ClassPathXmlApplicationContext("spring-core-ns.xml");
       
        Book b1 = (Book) context.getBean("book1");
        System.out.println(b1); // 102
//        
        Book b2 = (Book) context.getBean("book2");
        System.out.println(b2); // 102
        
        
    }
}
