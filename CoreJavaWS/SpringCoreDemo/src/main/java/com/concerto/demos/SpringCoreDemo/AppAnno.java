package com.concerto.demos.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.concerto.demos.SpringCoreDemo.entity.Author;
import com.concerto.demos.SpringCoreDemo.entity.Book;

/**
 * Hello world!
 *
 */
public class AppAnno 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new
        		ClassPathXmlApplicationContext("spring-core-anno.xml");
     
//        Author a2 = context.getBean(Author.class);
//        System.out.println(a2); // 102
        
        Book b1 = context.getBean(Book.class);
        System.out.println(b1);
        
    }
}
