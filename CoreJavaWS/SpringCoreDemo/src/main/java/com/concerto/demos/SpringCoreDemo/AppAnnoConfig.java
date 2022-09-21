package com.concerto.demos.SpringCoreDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.concerto.demos.SpringCoreDemo.entity.Author;
import com.concerto.demos.SpringCoreDemo.entity.Book;
import com.concerto.demos.SpringCoreDemo.entity.CollDemo;

// spring.xml file
@Configuration
@ComponentScan//("dummy")
public class AppAnnoConfig 
{
    public static void main( String[] args )
    {
       
        AbstractApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppAnnoConfig.class);
        System.out.println();
        for(String bean:context.getBeanDefinitionNames())
        	System.out.println(bean);
//        CollDemo cd1 = context.getBean(CollDemo.class);
//        System.out.println(cd1.getFruits());
//        System.out.println(cd1.getCertificates());
//        System.out.println(cd1.getMap());
//        System.out.println(cd1.getAuthors());
        
        //        Book b1 = context.getBean(Book.class);
//        System.out.println(b1);
        System.out.println();
        context.registerShutdownHook();
        
    }
   // @Bean
    
    public List<String> getFruits()
    {
    	System.out.println("get fruits called");
    	return Arrays.asList("Oranges","Apples","Grapes");
    }
  //  @Bean
    public Set<String> getCertificates()
    {
    	return new HashSet<>(
    			Arrays.asList("OCJP","CCNA"));
    }
  //  @Bean
    public Map<String, Integer> getMap()
    {
    	Map<String, Integer> map = new HashMap<>();
    	map.put("E1", 2);
    	map.put("E2", 20);
    	map.put("E3", 12);
    	return map;
    }
  //  @Bean("list")
    public List<Author> getAuthors()
    {
    	return Arrays.asList(
    		new Author(1, "Author 1", "suspense"),
    		new Author(2, "Author 2", "thriller"),
    	new Author(3, "Author 3", "suspense"));
    }
    
}

/**
 * interface Instrument -> play()
 * Guitar, Violin types of instrument
 * Singer class => 
 * singernmae,Instrument ref
 * display() => displays singername and the instrument singer is playing 
 * 
 * 
 * complete spring respective annotation based configurations
 * Load the singer class and call the display() of Singer class
 * 
 * 
 */
