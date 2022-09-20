package com.concerto.demos.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.concerto.demos.SpringCoreDemo.entity.Author;
import com.concerto.demos.SpringCoreDemo.entity.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new
        		ClassPathXmlApplicationContext("spring-core.xml");
        // spring => 1
//        Book book2 = new Book(2,"",0);
//        Book b3 = new Book();
//        b3.setBookid(3);
        /**
         * if more than 1 bean of type Book is configured
         * id is mandatory
         */
        System.out.println();
        Book b1 = (Book) context.getBean("book2");
        System.out.println(b1.getBookid()); // 102
        
        Book b2 = (Book) context.getBean("book2");
        System.out.println(b2.getBookid());// 102
        
        b1.setBookid(103);
        
        /*
         * Hello World!
			Book parameterized constructor
			Book default constructor
			102
			102
			103
			103
         */
        System.out.println(b1.getBookid());// 103
        System.out.println(b2.getBookid());// 103
        
        Book b3 = (Book) context.getBean("book3");
        System.out.println(b3); // 102
        /**
         * below syntax works if only 1 bean of type Book is 
         * configured
         */
//        Book b1 = context.getBean(Book.class);
//        System.out.println(b1);
        
//        Author a1 = (Author)context.getBean("a1");
//        System.out.println(a1);
    }
}
